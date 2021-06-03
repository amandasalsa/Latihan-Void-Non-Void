/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkgvoid.nonvoid;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Void {
    
    String nama, alamat, asal;
    int notelp;
    
    void isi(){
            System.out.println("--Silahkan isi data dibawah ini--");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Nama: ");
            nama = input.nextLine();
            
            System.out.println("Alamat: ");
            alamat = input.nextLine();
            
            System.out.println("Asal Sekolah: ");
            asal = input.nextLine();
          
            System.out.println("No. Telp: ");
            notelp = input.nextInt();
            
  

    }
            
    void data(){
        
        System.out.println("===========================");
        System.out.println("===========================");
        System.out.println("Nama           : "+nama);
        System.out.println("Alamat         : "+alamat);
        System.out.println("Asal Sekolah   : "+asal);      
        System.out.println("No. Telp       : "+notelp);
        System.out.println("===========================");
        System.out.println("===========================");
        
        
        
    }
            
    }           
                    
    

