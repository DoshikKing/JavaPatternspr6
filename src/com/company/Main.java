package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static Application confApp(String vendorName){
		Application app;
		AbstractFactory factory;

		if(vendorName.contains("intel".toLowerCase())){
			factory = new IntelFactory();
			app = new Application(factory);
		}
		else {
			factory = new AMDFactory();
			app = new Application(factory);
		}
		return app;
	}
	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Shapes are different objects (yay!)");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": And they are identical (yay!)");
				} else {
					System.out.println(i + ": But they are not identical (booo!)");
				}
			} else {
				System.out.println(i + ": Shape objects are the same (booo!)");
			}
		}
	}

    public static void main(String[] args) {
    	// Factory Method
	    CallingFactory callingFactory = new CallingFactory();
	    Call call = callingFactory.createCall("Moscow");
	    call.calling();

	    // Abstract Factory Method
		Application app = confApp("intel");
		app.create();

		// Builder
		Director director = new Director();
		BuilderHouse builderHouse = new BuilderHouse();
		director.construct(builderHouse, "4", true, true, true);
		builderHouse.getResult();

		BuilderOffices builderOffices = new BuilderOffices();
		director.construct(builderHouse, "20", true, true, true);
		builderOffices.getResult();

		// Prototype

		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapesCopy = new ArrayList<>();

		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);

		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);

		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);

		cloneAndCompare(shapes, shapesCopy);
    }
}
