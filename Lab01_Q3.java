import java.util.Scanner;

public class Lab01_Q3 {
    
    public static void main(String[] args)
     {
        Scanner Input = new Scanner(System.in);
        System.out.print("Kilograms to lose:");
        int KgtoLose = Input.nextInt();
        System.out.print("Days to lose:");
        int DaystoLose =Input.nextInt();
        int Calorie = 2000 *DaystoLose ;
        int Deficit =7700 * KgtoLose;
        int DeficitperDay = Deficit /DaystoLose;
        int DailyCalorie = (Calorie -Deficit)/ (DaystoLose);
        final int Carbonhydrate_Percent =50;
        final int Fat_Percent =30;
        final int Protein_Percent =20;
        int CarbonhydrateCal = DailyCalorie * Carbonhydrate_Percent/100;
        int FatCal = DailyCalorie * Fat_Percent/100;
        int ProteinCal = DailyCalorie * Protein_Percent/100;
        final int Carbonhydrate_Cal_per_Gram =4;
        final int Fat_Cal_per_Gram =9;
        final int Protein_Cal_per_Gram =4;
        double CarbonhydrateGram = ((double) CarbonhydrateCal) / Carbonhydrate_Cal_per_Gram;
        double FatGram = ((double) FatCal)/Fat_Cal_per_Gram;
        double ProteinGram = ((double) ProteinCal) /Protein_Cal_per_Gram;
        String a ="%";
        System.out.println("To lose " + KgtoLose+ " kilograms in " + DaystoLose + " days you will need a daily deficit of " 
        +DeficitperDay + " calories.");
        System.out.println("RECOMMENDED DAILY CALORIES TO LOSE " + KgtoLose+ " KILOS IN "+ DaystoLose+ " DAYS:" +DailyCalorie);
        System.out.println("MACRO         RECOMMENDED PERCENT  CALORIES PER GRAMS  RECOMMENDED CALORIES               GRAMS");
        System.out.printf("CARBOHYDRATE %19d" +"%s" +"%20d" + "%22d" + "%20.1f", Carbonhydrate_Percent,a,Carbonhydrate_Cal_per_Gram,
        CarbonhydrateCal, CarbonhydrateGram);
        System.out.println();
        System.out.printf("FAT %28d" +"%s" +"%20d" + "%22d" + "%20.1f", Fat_Percent,a, Fat_Cal_per_Gram, FatCal, FatGram);
        System.out.println();
        System.out.printf("PROTEIN %24d" +"%s" +"%20d" + "%22d" + "%20.1f", Protein_Percent,a, Protein_Cal_per_Gram, ProteinCal
        , ProteinGram);
        System.out.println();
     }
    
}
