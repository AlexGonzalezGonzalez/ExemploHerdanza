
package exemplo.pkgswitch;

public class metodos {
    public void comparar(String op){
    switch(op){
        case "1": System.out.println("luns");
            break;
        case "2": System.out.println("martes");
            break;
        case "3":System.out.println("mercores");
            break;  
        case "4": System.out.println("xoves");
            break;  
        case "5": System.out.println("venres");
            break;
        case "6": System.out.println("sabado");
            break;
        case "7": System.out.println("domingo");
            break;
        default: System.out.println("erro na opcion");
    }
}
}