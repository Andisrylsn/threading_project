//Analogikan Thread
/*
 *Rumah Tangga: representasi dari program yang sedang dijalankan
 *Anggota Keluarga: representasi dari thread bertanggung jawab atas tugas tertentu 
 *Perkerjaan: representasi dari Tugas atau aktivitas yang dilakukan setiap thread  
 */

 

public class MultithreadDemo extends Thread {
    
    public MultithreadDemo(String name){
        super(name);
    }    

    public void run(){


        for(int i  = 0; i < 8 ; i++ ){
            System.out.println(Thread.currentThread().getName() + " : " + i);
 
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        
        }

    }


}
