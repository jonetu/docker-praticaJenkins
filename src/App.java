
public class App 
{
    public static void main( String[] args ) throws Exception{
        System.out.println( "Exercicio docker-jenkins!" );
        int count = 1;
        try {
            while(true){
                Thread.sleep(2000);
                System.out.println("contador: "+ count++);
                
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
