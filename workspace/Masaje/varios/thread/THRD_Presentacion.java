package thread;

public class THRD_Presentacion extends Thread{

	private int contador;
	private boolean contar;
	
	public THRD_Presentacion() {
		this.contador = 0;
		this.contar = true;
	}
	
	public void Run() {
		while (contar) {
			
			try {
				Thread.sleep((long) 15000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			this.contador = this.contador + 10;
			
			if (this.contador >= 100) {
				this.contar = false;
			}
		}
	}
	
	public void Stop() {
		this.contar = false;
	}
}
