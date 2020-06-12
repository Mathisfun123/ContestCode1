import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BFS_attempts {
	public static void main(String[] args) throws FileNotFoundException {
		int [][] maze = new int[5][5];
		Scanner sc = new Scanner(new File("maze"));
		for (int i = 0; i < 5; i++) {
			String ln = sc.nextLine();
			for (int j = 0; j < 5; j++) {
				maze[i][j] = ln.charAt(j)-'0';
			}
		}
		int visited [][] = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		int posx= 0; int posy = 0;
		Queue<Points> points = new LinkedList<>();
		points.add(new Points(posx,posy,0)); boolean found = false;

		while(!found && points.size()>0){
			Points p = points.poll();
			posx= p.x; posy= p.y;
			if(visited[posx][posy] > p.val) {
				if(p.x <3){
					System.out.println("Hello " + (p.x+1) + " " + (p.y+1) + " " + p.val);
				}
				visited[posx][posy] = p.val;
				if (inBounds(posx + 1, posy) && maze[posx + 1][posy] == 0) {
					points.add(new Points(posx+1, posy, p.val+1));
				}
				if (inBounds(posx, posy + 1) && maze[posx][posy + 1] == 0) {
					points.add(new Points(posx, posy+1, p.val+1));
				}
				if (inBounds(posx + 1, posy + 1) && maze[posx + 1][posy + 1] == 0) {
					points.add(new Points(posx+1, posy+1, p.val+1));
				}
			}
			if(posx== 4 && posy ==4){
				found = true;
			}
		}
		System.out.println(found +" "+  visited[4][4]);
	}
	public static boolean inBounds(int x, int y){
		if(x<0 || x>4){
			return false;
		}else return y >= 0 && y <= 4;
	}
	static class Points{
		int x, y, val;
		public Points(int mx, int my, int mval){
			x = mx;
			y = my;
			val = mval;
		}
	}
}
