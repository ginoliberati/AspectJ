

import org.openqa.selenium.WebElement;
import controls.BaseControl;
import controls.Button;
import controls.Label;
import controls.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public aspect AspectTest {

	//Cuando se utilizan waits y el tiempo que se est� esperando.
	before(long time):
		call(void Thread.sleep(long)) && args(time){
			System.out.println("Has pausado la ejecuci�n por " + time/1000 + " segundos");
	}
	
	//Cuando se ingresa a una p�gina web y el nombre de la misma.
		before(String url):
			call(void WebDriver.get(String)) && args(url){
				System.out.println("Estas ingresando a la pagina web " + url);
		}

	//Cuando se clickea sobre cualquier WebElement, el tipo del mismo (bot�n, label, etc.)
	before(Button button):
		call(void Button.click()) && target(button){
			System.out.println("Has clickeado un boton("+button.text()+") "+button.id());
	}
	
	//Cuando se obtiene el texto de un WebElement, el tipo del mismo y el texto extra�do
	after(Label label) returning(String texto):
		call(String Label.text()) && target(label){
			System.out.println("Has obtenido el texto '" + texto + "' del Label "+label.id());
	}
	
	//Cuando se escribe en un Input y lo que se est� escribiendo.
	before(Input input, String text):
		call(void Input.write(String)) && args(text) && target(input){
			System.out.println("Estas escribiendo el texto '" + text + "' en un Input "+input.id());
	}
	
	//Todo aquello que considere necesario para que el Logger refleje todo lo que está sucediendo en el test.
	
	//Cuando vuelve hacia atrás la pagina.
	after():
		call(void *.back()){
			System.out.println("Has vuelto a la página web anterior");
	}
	
	
}
