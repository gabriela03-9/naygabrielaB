/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Aplicacion {
        static Scanner leer =new Scanner(System.in);
        
        
public static void ejercicio_1() {
        double a,b,c; // coeficientes ax^2+bx+c=0
        double x1,x2,d; // soluciones y determinante
        System.out.println("Introduzca primer coeficiente (a):");
        a=Entrada.entero();
        System.out.println("Introduzca segundo coeficiente: (b):");
        b=Entrada.entero();
        System.out.println("Introduzca tercer coeficiente: (c):");
        c=Entrada.entero();
        // calculamos el determinante
        d=((b*b)-4*a*c);
        if(d<0)
            System.out.println("No existen soluciones reales");
        else{
            // queda confirmar que a sea distinto de 0. 
             // si a=0 nos encontramos una división por cero.
            
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }
 

public static void ejercicio_2(){
 double a,r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r=Entrada.real();
        a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        
        System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
        
    }
 public static void ejercicio_3(){
      int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        
       // si ambos números son iguales diría que n2 es mayor que n1
       if(n1>n2)
          System.out.println(n1 + " es mayor que " + n2);
       else
          System.out.println(n2 + " es mayor que " + n1);      
       
}
 public static void ejercicio_4 (){
      int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        
        if(n1==n2)
            System.out.println("Son iguales");
        else
         {
          if(n1>n2)
              System.out.println(n1 + " es mayor que " + n2);
          else
              System.out.println(n2 + " es mayor que " + n1):
          
}
        public static voi ejercicio_5(){
            int num;
        int dm, um, c, d, u;
        // 9 9 . 9 9 9  a cada guarismo lo llamaremos:
        //dm um  c d u: dm (decenas de millar), um:(unidades de millar)
        //              c: (centenas), d: (decenas), u: (unidades)
         System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=Entrada.entero();
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
        // otra forma de hacerlo es
        num = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (num);
        
        }
        public static void ejecicio_6(){
             int nota;
        System.out.print("Introduzca una nota: ");
        nota=Entrada.entero();
        // tanto los if's como los else's encierran a una sola instrucción
        // y no es necesario utilizar llaves { }
        
        if(nota>=0 && nota<5)
            System.out.println("INSUFICIENTE");
        else
            if(nota==5)
                System.out.println("SUFICIENTE");
            else
                if(nota==6)
                    System.out.println("BIEN");
                else
                    if(nota==7 || nota==8)
                        System.out.println("NOTABLE");
                    else
                        if(nota==9 || nota==10 )
                            System.out.println("SOBRESALIENTE");
        }
        public static void ejercicio_7(){
         int nota;
        System.out.print("Introduzca una nota: ");
        nota=Entrada.entero();
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                  case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR");
                break;
                
                
        }
        publicc static void ejercicio_8(){
            int dia,mes,año;
        // para que una fecha sea correcta se tiene que cumplir
        // día en el rango 1..30
        // mes en el rango 1..12
        // año cualquiera distinto del 0
        System.out.print("Introduzca día: ");
        dia=Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes=Entrada.entero();
        System.out.print("Introduzca año: ");
        año=Entrada.entero();
        
        if (dia >= 1 && dia <=30)
            if (mes >= 1 && mes <= 12)
                if (año != 0)
                    System.out.println ("Fecha correcta");
                else
                    System.out.println ("Año incorrecto");
            else
                System.out.println("Mes incorrecto");
        else
            System.out.println("Día incorrecto");
        
        } 
        public static void ejercicio_9(){
            int dia,mes,año;
        int dias_del_mes=0; // guardaremos el número de días que tiene el mes
        System.out.print("Introduzca día: ");
        dia=Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes=Entrada.entero();
        System.out.print("Introduzca año: ");
        año=Entrada.entero();
        // suponemos que la fecha introducida es correcta
        if(mes==2 )
            dias_del_mes = 28;
        if(mes==4 || mes==6 || mes==9 || mes==11)
            dias_del_mes = 30;
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
            dias_del_mes = 31;
        // incrementamos el día
        dia ++;
        // si el día supera el número de días del mes,
        // lo reiniciamos a 1 e incrementamos el mes
        
        if (dia >= dias_del_mes)
        {
            dia = 1;
            mes ++;
            // si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
            if (mes >= 12)
            {
                mes = 1;
                año ++;
            }
        }
        // habría que tener en cuenta que el año pasa del -1 al +1
        // en este código pasaríamos del año -1 al 0 (que nunca existió)
        // para corregirlo:
        if (año == 0)
            año = 1;
        
        System.out.println (dia + "/"+ mes + "/" + año);
        }
        public static void ejercicio_10(){
             int h,m,s; // hora, minutos y segundos
        System.out.print("Introduzca hora: ");
        h=Entrada.entero();
        System.out.print("Introduzca minutos: ");
        m=Entrada.entero();
        System.out.print("Introduzca segundos: ");
        s=Entrada.entero();
        // suponemos que la hora introducida es correcta
        // incrementamos los segundos
        s ++;
        // si los segundos superan 59, los reiniciamos a 0 e incrementamos los minutos
        if (s >= 60)
        {
            s = 0;
            m ++;
            // si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
            if (m >= 60)
            {
                m = 0;
                h ++;
                // si la hora supera 23, la reiniciamos a 0
                if (h>=24)
                    h=0;
            }
        }
        System.out.println ("Fecha: "+ h + ":"+ m + ":" + s);
        }
        public static void ejercicio_11(){
            int num;
        System.out.print("Introduzca una nota numérica entre 0 y 10: ");
        num=Entrada.entero();
        switch(num){
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
                case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
                
        }
        public static void ejercicio_12(){
            int num, contador;
            // num guardará los números introducidos
            // y contador se incrementará para llevar la cuenta de los números introducidos
        
        System.out.print("Introduzca un número: ");
        num=Entrada.entero();
        contador=0;   // al comienzo el número de números introducidos es 0
        
        while(num>0) // mientras num sea positiva
        {
            contador =contador+1; // contador toma el valor que tuviera en este momento más uno
                                  // en definitiva: contador se incrementa en uno
            System.out.print("Introduzca otro número: ");
            num=Entrada.entero();
        }
        System.out.println("Se han introducido: " +contador + " números");
        // sin tener en cuenta el último número negativo.
        
        }
        public static void ejercicio_13(){
            int n, num;
            // n es el número que hay que acertar
        // num guarda los números introducidos
        System.out.print("Introduce N: ");
        n =Entrada.entero();
        System.out.print("Introduce número: ");
        num=Entrada.entero();
        
        while(num!=n) // mientras no coincidan ambos números
        {
            if(num>n)
                System.out.println("menor");
            else
                System.out.println("mayor");
            System.out.print("Introduce número: ");
            num=Entrada.entero();
        }
        // al salir del mientras tenemos la certeza que num es igual a n
        
        System.out.println("acertaste...");
        }
        public static void ejercicio_14(){
            int n, num;
        // n es el número que hay que acertar
        // num guarda los números introducidos
         n=(int)(Math.random()*100)+1;
        // en lugar de pedir n... podemos hacer que se n tome un valor
        // aleatorio entre 1 y 100.
        // Así el juego es algo más entretenido.
        
        System.out.print("Introduce número: ");
        num=Entrada.entero();
        
        while(num!=n) // mientras no coincidan ambos números
        {
            if(num>n)
                System.out.println("menor");
            else
                System.out.println("mayor");
            System.out.print("Introduce número: ");
            num=Entrada.entero();
        }
        // al salir del mientras tenemos la certeza que num es igual a n
        
        System.out.println("acertaste...");
        }
         public static void ejercicio_15(){ 
         int i,num;
        System.out.print("Introduce un número: ");
        num=Entrada.entero();
        i=1;
        // i es el contador que tomará los valores de 1 a n
        while(i<=num){
            System.out.println(i);
            i++;
        }
        public static void ejercicio_16(){
                int num;
        int cont_ceros; // el contador de ceros
        int cont_pos; // contador de positivos
        int cont_neg; // contador de negativos
        int suma_pos,suma_neg; // suma de los números positivos y negativos
        
        float media_pos,media_neg; // las medias 8positivas y negativa9 pueden tener decimales
        cont_ceros=0;
        cont_pos=0;
        cont_neg=0;
        suma_pos=0;
        suma_neg=0;
        for (int i=1;i<=10;i++)
        
            System.out.print("Introduce número: ");
            num=Entrada.entero();
            if(num==0)
                cont_ceros++;
            else
            {
                if(num>0)
                {
                    cont_pos++;
                    suma_pos+=num;
                }
                else
                {
                    cont_neg++;
                    suma_neg+=num;
                
            }
        }
        // tratamos los ceros
        System.out.println("El número de ceros introducidos es de: "+cont_ceros);
        //Tratamos los positivos
        if (cont_pos ==0)
            System.out.println("No se puede hacer la media de los positivos");
                    {
            media_pos= (float)suma_pos/cont_pos;
            System.out.println("Media de los positivos: "+ media_pos);
        
        // tratamos los negativos
        if (cont_pos ==0)
            System.out.println("No se puede hacer la media de los negativos");
        else
        
            media_neg= (float)suma_neg/cont_neg;
            System.out.println("Media de los negativos: "+ media_neg);
            
}
        public static void ejercicio_17(){
             int sueldo,suma,mayor_1000;
        suma=0;
        mayor_1000=0;
        for (int i=1;i<10;i++)
        {
            System.out.print("Escribe un sueldo: ");
            sueldo =Entrada.entero();
            if(sueldo>1000)
                mayor_1000++;
            suma=suma+sueldo;
        }
        System.out.println("Mayores de 1000 hay: "+mayor_1000);
        System.out.println("la suma es de: "+suma);
        }
        
        public static void ejercicio_18(){
           int num;
        do
        {
            System.out.print("Introduce número (de 0 a 10): ");
            num=Entrada.entero();
        }
            while ( !  (0<=num && num<=10));
        System.out.println("\n\nTabla del " + num);
        
        for (int i=1;i<=10;i++)
        {
            System.out.println(num + " x " + i + " = " + num*i);
        }
        public static void ejercicio_19(){
            int nota,aprobados,suspensos,condicionados;
        aprobados=0;
        suspensos=0;
        condicionados=0;
        
        for (int i=1;i<=6;i++)
        {
            System.out.print("Introduzca nota entre 0 y 10: ");
            nota=Entrada.entero();
            if(nota == 4)
                condicionados++;
            else
                if(nota >= 5)
                    aprobados++;
                else
                    if(nota < 4) // este if sobra, ya que es el único caso posible
                        suspensos++;
                
            
        }
        System.out.println("Aprobados: " +aprobados);
        System.out.println("Suspensos: " +suspensos);
        System.out.println("Condicionados: "+condicionados);
        }
        public static void ejercicio_20(){
             int sueldo, sueldo_max;
        int n;
        sueldo_max = 0; // como los sueldos son positivos, inicializamos el sueldo
                        // máximo a cero.
        System.out.print("Número de sueldos: ");
        n = Entrada.entero();
        System.out.println("--------");
        for (int i=1;i<=n;i++)
        {
            System.out.print("Introduce sueldo: ");
            sueldo=Entrada.entero();
            if (sueldo > sueldo_max)
                sueldo_max = sueldo;
                // si leemos un sueldo mayor que el máximo, este sueldo será el nuevo máximo.
        }
        System.out.println("\nEl sueldo máximo es: " +sueldo_max);
        }
        public static void ejercicio_21(){
            int num;
        boolean hay_negativo;
            // la variable hay_negativo según los dos posibles valores indica:
            // false: no se ha introducido ningún número negativo
            // true: al menos hay un número negativo
        hay_negativo =false;
        // suponemos que no habrá ningún negativo
        for (int i=1;i<=10;i++)
        {
            System.out.print("Introduce número: ");
            num=Entrada.entero();
            if(num<0)
                hay_negativo =true;
                // si num es menor que cero, cambiamos el valor de hay_negativo a true
        }
        if(hay_negativo == true)
            System.out.println("Se ha introducido algún número negativo");
        else
            System.out.println("No hay ningún número negativo");
        }
        public sstatic void ejercicio_22(){
            int notas;
        boolean suspensos;
        suspensos=false; // suponemos que en principio no hay ningún suspenso
        for (int i=0;i<5;i++)
        {
            System.out.print("Introduzca nota (de 0 a 10): ");
            notas=Entrada.entero();
            if(notas<5)
                suspensos=true;
        }
        if(suspensos)
            System.out.println("Hay alumnos suspensos");
        else
            System.out.println("No hay suspensos");
        
        }
        public static void ejercicio_23(){
            int t[];         
         
         t = new int[5];
        for (int i=0;i<5;i++)
        {
            System.out.print("Introduzca un número: ");
            t[i]=Entrada.entero();
        }
        System.out.println("Los números son:");
        for (int i=0;i<5;i++)
            System.out.println(t[i]);
        }
        public static void ejercicio_24(){
            int t[]=new int[10];
        int elemento, posicion;
        // leemos 8 números
        System.out.println("Leyendo datos...");
        for (int i=0;i<8;i++){
            System.out.print("Introduzca número: ");
            t[i]=Entrada.entero();
        }
        // pedimos el nuevo elemento y la posición
        System.out.print("Nuevo elemento: ");
        elemento = Entrada.entero();
        System.out.print("Posición donde insertar (de 0 a 8): ");
        posicion = Entrada.entero();
        // supondremos que la posición estará entre 0 y 8.
        // un valor distinto podría dar un error en tiempo de ejecución
        // una posible mejora, propuesta para el lector, es comprobar esto.
        
        // ahora desplazaremos los elementos de la tabla 
        // desde posición hasta el último (en este caso 7)
        for (int i=7;i>=posicion;i--)
            t[i+1]=t[i];
        //insertamos el nuevo elemento
        t[posicion] =elemento;
        System.out.println("La tabla queda:");
        for (int i=0;i<9;i++)
            System.out.println(t[i]);
        }
}