/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;
import java.util.Scanner;
/**
 *
 * @author kenic
 */
public class CalculadoraMatematica {

    Scanner s = new Scanner(System.in);
    int numero1;
 int numero2;


    public CalculadoraMatematica() {
        
    }

/*Poder ingresar dos numeros, ya al ingresarlos se guarden en esa funcion-metodo*/
public void IngresarNumero(int numero1, int numero2){
this.numero1 = s.nextInt();
this.numero2 = s.nextInt();

}
/*Este metodo es para poder sumar dos numeros*/
public int sumar(int numero1, int numero2){
    return (this.numero1 + this.numero2);
}

/*Este metodo es para poder restar dos numeros*/
public int restar(int numero1, int numero2){
return (this.numero1 - this.numero2);}

/*Este metodo es para poder multiplicar dos numeros*/
public int multiplicar(int numero1, int numero2){
return (this.numero1 * this.numero2);}

/*Este metodo es para poder dividir dos numeros*/
public int dividir(int numero1, int numero2){
    
    /*El if utilizado es por si el denominador es 0, para que el resultado no sea 0*/
    if(this.numero2 == 0){return 0;}
    else{
 return (this.numero1 / this.numero2);}





}


}
