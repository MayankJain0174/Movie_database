import java.sql.ResultSet;

public class movie {

	public static void main(String[] args) {

		try {
			conn c = new conn();
			String q = "select * from movie_details";
			ResultSet rs = c.s.executeQuery(q);		
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + rs.getString("movie_name") + rs.getString("movie_actor")+ 
						rs.getString("movie_actress")+ rs.getInt("movie_year")+ rs.getString("movie_director"));
			}
			
		} 
		catch (Exception e) {} 

	}

}


