
/*
 * 累己老: 2016-03-02
 * 累己磊: 辫家锐
 */
public class AlphabetProgram {

	public static void main(String[] args) {

		int cnt='Z'-'A'+1;
		
		/*for(int i=0; i<cnt; i++){
			System.out.printf("%c", 'A'+i );*/
		
		/*for(int i=0; i<cnt; i++){
		System.out.printf("%c", 'Z'-i );*/
		
		/*cnt *= 2;
		
		for(int i=0; i<cnt; i++){
			System.out.printf("%c", 'A'+(i%26));*/
		
		cnt *= 2;
		
		for(int i=0; i<cnt; i++){
			System.out.printf("%c", i<26 ? 'A'+(i%26) : 'Z'-(i%26));
		
		/*cnt *= 2;
		for(int i=0; i<cnt; i++){
			
			if(i==3)
			continue;
				
			System.out.printf("%c", i<26 ? 'A'+(i%26) : 'Z'-(i%26));*/
		}
	}
}