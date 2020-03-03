package ua.itea;

import model.Dog;
import static org.mockito.Mockito.*;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		System.out.println(dog);
		
		
		Dog mockDog = mock(Dog.class);
		
				

		when(mockDog.getName()).thenReturn("Suslik").thenReturn("Krevedko"); //несколько вызовов
		
//		verify(mockDog).setName("ddddddd");
		
		Dog spyDog = spy(Dog.class);
		
		when(spyDog.getName()).thenReturn("Suslik").thenReturn("Krevedko");
		
		
//		System.out.println(mockDog.getName());
		System.out.println(spyDog.toString());
		System.out.println(spyDog.getName());
		System.out.println(spyDog.getName());

	}

}
