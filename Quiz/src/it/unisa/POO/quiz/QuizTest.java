package it.unisa.POO.quiz;

public class QuizTest 
{
	public static void main(String[] args) 
	{
		DataSet ds = new DataSet();
		ds.add(new Quiz(1,"A+"));
		ds.add(new Quiz(2,"B-"));
		ds.add(new Quiz(3,"C+"));
		System.out.println("Punteggio medio = "+ ds.getAverage());
		Measurable max = ds.getMaximum();
		System.out.println("Punteggio piu` alto = "+ max.getMeasure());
		Measurable min = ds.getMinimum();
		System.out.println("Punteggio più basso= "+ min.getMeasure());
	}
}