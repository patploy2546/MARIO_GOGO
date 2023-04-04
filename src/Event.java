
public class Event {
			public static boolean checkHit(Mario mario,Wave wave,int MarioSize,int waveHeight){
							if(mario.x+MarioSize>wave.x&&mario.x<wave.x) {
								if(mario.y+MarioSize>=wave.y-waveHeight) {
									return true;
								}
							}
							return false;
			}
			
			public static void gameStop(Wave[] wave,Environment[] env) {

			}

}
