package com.umg.data.structures.LinkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList<String> ListNode = new DoublyLinkedList<String>();
		
		System.out.println(" 1.  Insertar al inicio");
		System.out.println(" 2.  Insertar al final");
		System.out.println(" 3.  Recorrer hacia adelante");
		System.out.println(" 4.  Recorrer hacia atras");
		System.out.println(" 5.  Mostrar el tamaño de la lista");
		System.out.println(" 6.  Mostrar si la lista este vacia");
		System.out.println(" 7.  Buscar elemento por valor");
		System.out.println(" 8.  Buscar elemento por indice");
		System.out.println(" 9.  Borrar un elemento");
		System.out.println(" 10. Salir");
		
		Scanner sc = new Scanner(System.in); 
		int eleccion = sc.nextInt();
			
			switch(eleccion) {
		    case 1:
		    	System.out.println("Insertar Inicio");
                System.out.println("");
		    	System.out.println("Agregar dato 1");
		    	String IIdato1 = sc.next();
		    	System.out.println("Agregar dato 2");
		    	String IIdato2 = sc.next();
		    	System.out.println("Agreguar dato 3");
		    	String IIdato3 = sc.next();
		    	System.out.print("¿Desea mostrar la lista?");
                System.out.println("");
                System.out.println("1) Si");
                System.out.println("2) No");
                int opcion = sc.nextInt();
                
		    	ListNode.insertAtHead(IIdato1);
		    	ListNode.insertAtHead(IIdato2);
		    	ListNode.insertAtHead(IIdato3);
		    	
                if(opcion == 1){
                    ListNode.traverseForward();
                }else{
                    System.out.println("Salir");
                }
		    	
		    	break;
		    
		    case 2:
		    	System.out.println("Insertar Final ");
		    	System.out.println("");
		    	System.out.println("Agregar dato 1");
		    	String IFdato1= sc.next();
		    	System.out.println("Agregar dato 2");
		    	String IFdato2 = sc.next();
		    	System.out.println("Agregar dato 3");
		    	String IFdato3 = sc.next();
		    	System.out.print("¿Desea mostrar la lista?");
                System.out.println("");
                System.out.println("1) Si");
                System.out.println("2) No");
                int opcion1 = sc.nextInt();
                
		    	ListNode.insertAtTail(IFdato1);
		    	ListNode.insertAtTail(IFdato2);
		    	ListNode.insertAtTail(IFdato3);
		    	
		    	if(opcion1 == 1){
                    ListNode.traverseForward();
                }else{
                    System.out.println("Salir");
                }
		    	
		    	break;
		    	
		    case 3:
		    	System.out.println("Recorrer hacia adelante");
		    	System.out.println("");
		    	System.out.println("Agregue un dato 1");
		    	String RAdato1= sc.next();
		    	System.out.println("Agregue un dato 2");
		    	String RAdato2 = sc.next();
		    	System.out.println("Agregue un dato 3");
		    	String RAdato3 = sc.next();
		    	System.out.println("");
		    	
		    	ListNode.insertAtHead(RAdato1);
		    	ListNode.insertAtHead(RAdato2);
		    	ListNode.insertAtHead(RAdato3);
		    	
		    	ListNode.traverseForward();
		    	break;
		    	
		    case 4:
		    	System.out.println("Mostrar tamaño de la lista");
		    	System.out.println("");
				System.out.println("Agregar dato 1");
		    	String MLdato1= sc.next();
		    	System.out.println("Agregar dato 2");
		    	String MLdato2 = sc.next();
		    	System.out.println("Agregar dato 3");
		    	String MLdato3 = sc.next();
		    	System.out.println("");
		    	
		    	ListNode.insertAtHead(Data41);
		    	ListNode.insertAtHead(Data42);
		    	ListNode.insertAtHead(Data43);
	
		    	ListNode.traverseBackward();
		    	break;
		    	
		    case 5:
		    	System.out.println("Mostrar el tamaño de la lista");
		    	System.out.println("");
		    	System.out.println("Agregar dato 1");
		    	String MTLdato1= sc.next();
		    	System.out.println("Agregar dato 2");
		    	String MTLdato2 = sc.next();
		    	System.out.println("Agregar dato 3");
		    	String MTLdato3 = sc.next();
		    	System.out.println("");
		    	
		    	ListNode.insertAtHead(MTLdato1);
		    	ListNode.insertAtHead(MTLdato2);
		    	ListNode.insertAtHead(MTLdato3);
		    	
		    	ListNode.traverseForward();
		    	
		    	int SizeList = ListNode.size();

		    	System.out.println("El tamaño de la lista es: " + SizeList);
		    	break;
		    	
		    case 6:
		    	System.out.println("Mostrar si la lista este vacia");
		    	System.out.println("");
		    	System.out.println("Desea ingresar datos?");
	            System.out.println("1) Si");
	            System.out.println("2) No");
		    	System.out.println("");
		    	int datos = sc.nextInt();
		    	
		    	if (datos == 1) {
		    		System.out.println("Agregar dato 1");
			    	String MVdato1 = sc.next();
			    	System.out.println("Agregar dato 2");
			    	String MVdato2 = sc.next();
			    	System.out.println("Agregar dato 3");
			    	String MVdato3 = sc.next();
			    	System.out.println("");
			    	
			    	ListNode.insertAtHead(MVdato1);
			    	ListNode.insertAtHead(MVdato2);
			    	ListNode.insertAtHead(MVdato3);
			    	
			    	ListNode.traverseForward();
			    	
		    		Boolean Equals = ListNode.isEmpty();
		    		System.out.println("La lista esta vacia? " + Equals);
		    		
		    	} else {
		    		Boolean Equals = ListNode.isEmpty();
		    		System.out.println("La lista esta vacia? " + Equals);
		    	}
		    	break;
		    	
		    case 7:
		    	System.out.println("Buscar elemento por valor");
		    	System.out.println("");
		    	System.out.println("Agregar un dato 1");
		    	String BVdato1 = sc.next();
		    	System.out.println("Agregar un dato 2");
		    	String BVdato2 = sc.next();
		    	System.out.println("Agregar un dato 3");
		    	String BVdato3 = sc.next();
		    	System.out.println("");
		    	
		    	ListNode.insertAtHead(BVdato1);
		    	ListNode.insertAtHead(BVdato2);
		    	ListNode.insertAtHead(BVdato3);
		    	ListNode.traverseForward();

		    	System.out.println("Agrega el dato que deseas buscar:");
		    	int datoBuscar = sc.nextInt();
		    	
		    	if (datoBuscar == 1) {
		    		ListNode.searchByValue(Data71);
		    		System.out.println("El valor es: " + BVdato1);
		    	} else if (Look == 2) {
		    		ListNode.searchByValue(Data72);
		    		System.out.println("El valor es: " + BVdato2);
		    	} else {
		    		ListNode.searchByValue(Dato73);
		    		System.out.println("El valor es: " + BVdato3);
		    	}
		    	break;
		    	
		    case 8:
		    	System.out.println("Buscar elemento por indice");
		    	System.out.println("");
		    	System.out.println("Agregar dato 1");
		    	String BIdato1 = sc.next();
		    	System.out.println("Agregar dato 2");
		    	String BIdato2 = sc.next();
		    	System.out.println("Agregar dato 3");
		    	String BIdato3 = sc.next();
		    	System.out.println("");
		    	
		    	ListNode.insertAtHead(BIdato1);
		    	ListNode.insertAtHead(BIdato2);
		    	ListNode.insertAtHead(BIdato3);
		    	
		    	ListNode.traverseForward();

		    	System.out.println();
		    	System.out.println("Agrega dato que deseas buscar:");
		    	int indicebuscar = sc.nextInt();
		    	
		    	if (indicebuscar == 1) {
		    		ListNode.searchByIndex(0); 
		    		System.out.println("El indice es: " + BIdato1);
		    	} else if (LookIndex == 2) {
		    		ListNode.searchByIndex(1); 
		    		System.out.println("El indice es: " + BIdato2);
		    	} else {
		    		ListNode.searchByIndex(2);
		    		System.out.println("El indice es: " + BIdato3);
		    	}
		    	break;
		    	
		    case 9:
		    	System.out.println("Borrar un elemento");
		    	System.out.println("");
		    	System.out.println("Agregar dato 1");
		    	String BEdato1 = sc.next();
		    	System.out.println("Agregar dato 2");
		    	String BEdato2 = sc.next();
		    	System.out.println("Agregar dato 3");
		    	String BEdato3 = sc.next();
		    	System.out.println("");
		    	
		    	ListNode.insertAtHead(BEdato1);
		    	ListNode.insertAtHead(BEdato2);
		    	ListNode.insertAtHead(BEdato3);
		    	
		    	ListNode.traverseForward();

		    	System.out.println("Ingrese el indice a eliminar:");
		    	int borraropcion = sc.nextInt();
		    	
		    	if (borraropcion == 1) {
		    		ListNode.deleteFromPosition(1); 
		    	} else if (DelteLayer == 2) {
		    		ListNode.deleteFromPosition(2); 
		    	} else {
		    		ListNode.deleteFromPosition(3); 
		    	}
		    	
		    	System.out.println();
		    	ListNode.traverseForward();
		    	break;

            case 10:
			System.out.println("");
			System.out.println("Saliendo");
			System.out.println("");
                break;
			}		
	}
}
