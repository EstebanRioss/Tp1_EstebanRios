package ar.edu.unju.fi.ejercicio12Model;

import java.util.Calendar;

public class Persona {
	private String NombrePersona;
	private Calendar FechaNac;
	
	public Persona() {
	}

	public String getNombrePersona() {
		return NombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		NombrePersona = nombrePersona;
	}

	public Calendar getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		FechaNac = fechaNac;
	}
	
	public int Edad() {
		// Obtener el año de nacimiento
        int AñoN = this.getFechaNac().get(Calendar.YEAR);
        int AñoA = Calendar.getInstance().get(Calendar.YEAR);
        
        return AñoA - AñoN;
	}
	
	public String SignoZ() {
		int MesN = this.getFechaNac().get(Calendar.MONTH) + 1;
		int Dia = this.getFechaNac().get(Calendar.DAY_OF_MONTH);
		 switch (MesN) {
			 case 1: {
				 if(Dia < 20) {
					 return "Capricornio";
				 }
				 else {
					 return "Acuario";
				 }
			 }
			 case 2:{
				 if( Dia < 20) {
					 return "Acuario";
				 }
				 else {
					 return "Piscis";
				 }
				 
			 }
			 case 3:{
				 if( Dia < 21) {
					 return "Piscis";
				 }
				 else {
					 return "Aries";
				 }
				 
			 }
			 case 4:{
				 if( Dia < 20) {
					 return "Aries";
				 }
				 else {
					 return "Tauro";
				 }
				 
			 }
			 case 5:{
				 if( Dia < 21) {
					 return "Tauro";
				 }
				 else {
					 return "Geminis";
				 }
			 }
			 case 6:{
				 if( Dia < 21) {
					 return "Geminis";
				 }
				 else {
					 return "Cancer";
				 }
			 }
			 case 7:{
				 if( Dia < 23) {
					 return "Cancer";
				 }
				 else {
					 return "Leo";
				 }
			 }
			 case 8:{
				 if( Dia < 23) {
					 return "Leo";
				 }
				 else {
					 return "Virgo";
				 }
			 }
			 case 9:{
				 if( Dia < 23) {
					 return "Virgo";
				 }
				 else {
					 return "Libra";
				 }
			 }
			 case 10:{
				 if( Dia < 23) {
					 return "Libra";
				 }
				 else {
					 return "Escorpio";
				 }
			 }
			 case 11:{
				 if( Dia < 22) {
					 return "Escorpio";
				 }
				 else {
					 return "Sagitario";
				 }
			 }
			 case 12:{
				 if( Dia < 22) {
					 return "Sagitario";
				 }
				 else {
					 return "Capricornio";
				 }
			 }
			 default:{
				 return "Error";
			 }
		 }
	}
	
	public String Estacion() {
		int Mes = this.getFechaNac().get(Calendar.MONTH) + 1;
		int Dia = this.getFechaNac().get(Calendar.DAY_OF_MONTH);
		switch (Mes) {
		 case 1: {
			 return "Verano";
		 }
		 case 2:{
			 return "Verano";
		 }
		 case 3:{
			 if ( Dia < 22) {
				 return "Verano";
			 }
			 else {
				 return "Otono";
			 }
		 }
		 case 4:{
			 return "Otono";
		 }
		 case 5:{
			 return "Otono";
		 }
		 case 6:{
			 if( Dia < 22) {
				 return "Otono";
			 }
			 else {
				 return "Invierno";
			 }
		 }
		 case 7:{
			 return "Invierno";
		 }
		 case 8:{
			 return "Invierno";
		 }
		 case 9:{
			 if( Dia < 22) {
				 return "Invierno";
			 }
			 else {
				 return "Primavera";
			 }
		 }
		 case 10:{
			 return "Primavera";
		 }
		 case 11:{
			 return "Primavera";
		 }
		 case 12:{
			 if( Dia < 22) {
				 return "Primavera";
			 }
			 else {
				 return "Verano";
			 }
		 }
		 default:{
			 return "Error";
		 }
		}
	
	}

	public void Mostradatos() {
		System.out.println("**Datos de la persona**");
		System.out.println("Nombre: " + this.getNombrePersona());
		System.out.println("Fecha Nacimiento: " + this.getFechaNac().get(Calendar.DAY_OF_MONTH) + "/" + (this.getFechaNac().get(Calendar.MONTH)+1) + "/" + this.getFechaNac().get(Calendar.YEAR));
		System.out.println("Edad: " + this.Edad());
		System.out.println("Signo del zodiaco: " + this.SignoZ());
		System.out.println("Estacion: " + this.Estacion());
	}
}
