package recipes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import provided.util.DaoBase;
import recipes.entity.Recipe;
import recipes.exception.DbException;

public class RecipeDao extends DaoBase {
	private static final String CATEGORY_TABLE = "category";
	private static final String INGREDIENT_TABLE = "ingredient";
	private static final String RECIPE_TABLE = "recipe";
	private static final String RECIPE_CATEGORY = "recipe_category";
	private static final String STEP_TABLE = "step";
	private static final String UNIT_TABLE = "unit";

	public void executeBatch(List<String> sqlBatch) {
		try(Connection conn = DbConnection.getConnection()) {
			startTransaction(conn);
			
			try(Statement stmt = conn.createStatement()) {
				for(String sql : sqlBatch) {
					stmt.addBatch(sql);
				}
				stmt.executeBatch();
				commitTransaction(conn);
			}
			catch (Exception e) {
				rollbackTransaction(conn);
				throw new DbException(e);
			}
		} catch (SQLException e) {
			throw new DbException(e);
		}
	}

	public Recipe insertRecipe(Recipe recipe) {
		// @formatter:off
		String sql = ""
				+ "INSERT INTO " + RECIPE_TABLE + " "
				+ "(recipe_name, notes, num_servings, prep_time, cook_time) "
				+ "VALUES "
				+ "(?, ?, ?, ?, ?)";
		// @formatter:on
		
		try(Connection conn = DbConnection.getConnection()) {
			startTransaction(conn);
			
			try(PreparedStatement stmt = conn.prepareStatement(sql)) {
				setParameter(stmt, 1, recipe.getRecipeName(), String.class);
				setParameter(stmt, 2, recipe.getNotes(), String.class);
				setParameter(stmt, 3, recipe.getNumServings(), Integer.class);
				setParameter(stmt, 4, recipe.getPrepTime(), LocalTime.class);
				setParameter(stmt, 5, recipe.getCookTime(), LocalTime.class);
				
				stmt.executeUpdate();
				Integer recipeId = getLastInsertId(conn, RECIPE_TABLE);
				
				commitTransaction(conn);
				
				recipe.setRecipeId(recipeId);
				return recipe;
			}
			catch(Exception e) {
				rollbackTransaction(conn);
				throw new DbException(e);
			}
		} catch (SQLException e) {
			throw new DbException(e);
		} // end of try-catch 
	} // end of insertRecipe

	public List<Recipe> fetchAllRecipes() {
		String sql = "SELECT * FROM " + RECIPE_TABLE + " ORDER BY recipe_name";
		
		try(Connection conn = DbConnection.getConnection()) {
			startTransaction(conn);
			
			try(PreparedStatement stmt = conn.prepareStatement(sql)) {
				try(ResultSet rs = stmt.executeQuery()) {
					List<Recipe> recipes = new LinkedList<>();
					
					while(rs.next()) {
						recipes.add(extract(rs, Recipe.class));
					}
					return recipes;
				}
			} catch(Exception e) {
				rollbackTransaction(conn);
				throw new DbException(e);
			}
			
		} catch (SQLException e) {
			throw new DbException(e);
		}
	} // end of fetchAllRecipes ---
	
} // end of RecipeDao class -------------
