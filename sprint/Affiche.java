package affichage;
import java.sql.*;
import java.time.LocalDate;

public class Affiche
{ 
  public static void main (String[] args)throws Exception
  {
    //  Connect con=new Connect();
    //  Connection connection=con.getConnectionPsql();

    //  Employe_Specialite empSp= new Employe_Specialite();
    //  empSp.setIdemploye(2);
    //  empSp.setIdspecialite( Integer.valueOf(2) );
    //  empSp.insert(connection, null);
    // LocalDate now=LocalDate.now();
    // LocalDate ldate=LocalDate.of(2002,2,2);//annee mois days 
    // System.out.println(now.compareTo(ldate) );

    // Connect connect=new Connect();
    // Connection connection=connect.getConnectionPsql();
    //       ObjectDB[] objsEmp=new Employe().selectAll(connection);
    //       ObjectDB[] objsEmp_spc=new Employe_Specialite().selectAll(connection);
    //       ObjectDB[] objsSpclt=new Specialite().selectAll(connection);
    //       ObjectDB[] objsNivEtud=new NiveauEtude().selectAll(connection);

    //       Employe[] allEmp=new Employe[objsEmp.length]; 
    //       Employe_Specialite[] allEmp_spclt=new Employe_Specialite[objsEmp_spc.length];
    //       Specialite[] allspecialite=new Specialite[ objsSpclt.length ];
    //       NiveauEtude[] allNiveauEtude=new NiveauEtude[objsNivEtud.length];

    //       for(int i=0;i< objsEmp.length;i++){ allEmp[i]=(Employe)objsEmp[i]; }
    //       for(int i=0;i< objsEmp_spc.length;i++){ allEmp_spclt[i]=(Employe_Specialite)objsEmp_spc[i]; }
    //       for(int i=0;i< objsSpclt.length;i++){ allspecialite[i]=(Specialite)objsSpclt[i]; }
    //       for(int i=0;i< objsNivEtud.length;i++){ allNiveauEtude[i]=(NiveauEtude)objsNivEtud[i]; }

    //   for(int i=0;i< allEmp.length;i++){
    //        System.out.println(allEmp[i].getNom()); 
    //        System.out.println(allEmp[i].getPrenom()); 
    //        System.out.println(allEmp[i].getGenre()); 
    //        System.out.println(allEmp[i].getAge());   
    //        System.out.println(allEmp[i].getNiveauEtude(allNiveauEtude).getNiveauEtude()); 
    //        System.out.println(allEmp[i].getSpecialitesStr(allEmp_spclt,allspecialite));
    //   } 
    Time time=Time.valueOf("01:30:00");
    Time time1=Time.valueOf("01:00:00");
    Time time2=Time.valueOf("00:30:00");
    System.out.println(time.getTime());
    System.out.println(time1.getTime()+time2.getTime());
    

  } 
      
}