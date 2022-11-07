import java.util.Scanner;
    
    public class Sinifgecme {
        public static void main(String[] args) {
            
           Scanner inp = new Scanner(System.in);
            
            Double Matematik , Fizik , Kimya , Biyoloji , Türkçe  , toplamderssayısı , ortalama , notsayısı;

                System.out.print("Matematik notunu giriniz :");
                    
                    Matematik =inp.nextDouble();

                    if (Matematik>=101){System.out.print("Lütfen 0'dan 100'e kadar sayı girin :");Matematik = inp.nextDouble();}else if(Matematik>100){System.out.print("İşlem bitti");}
                        System.out.print("Fizik notunu giriniz :");

                            Fizik = inp.nextDouble();
                            if (Fizik>=101){System.out.print("Lütfen 0'dan 100'e kadar sayı girin :");Fizik = inp.nextDouble();}
                                System.out.print("Kimya notunu giriniz :");

                                    Kimya =inp.nextDouble();
                                    if (Kimya>=101){System.out.print("Lütfen 0'dan 100'e kadar bir sayı girin :");Kimya = inp.nextDouble();}

                                        System.out.print("Biyoloji notunu giriniz :");

                                            Biyoloji = inp.nextDouble();
                                            if (Biyoloji>=101){System.out.print("Lütfen 0'dan 100'e kadar sayı girin :");Biyoloji = inp.nextDouble();}

                                                System.out.print("Türkçe notunu giriniz :");

                                                    Türkçe = inp.nextDouble();
                                                    if (Türkçe>=101){System.out.print("Lütfen 0'dan 100'e kadar sayı girin :");Türkçe = inp.nextDouble();}

                                                    double avarage=(Matematik+Fizik+Biyoloji+Türkçe+Kimya)/5;

                                                    if (avarage>55&&(55<avarage)) {System.out.println(+avarage+"\tOrtalama ile sınıfı geçtiniz");}
                                                    else {System.out.println(+avarage+"\tOrtalama ile sınıfta kaldınız ");}
        
                                                 if  ((Matematik<(101))||(Fizik<101)||(Biyoloji<101)||(Türkçe<101)||(Kimya<101));}
        {System.out.print("100 den sonra sayı giremezsiniz");}
    }
        


        
    