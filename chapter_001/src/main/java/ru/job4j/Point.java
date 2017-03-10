package ru.job4j;

/**
 * Created by artursafiullin on 2017-03-05.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    boolean isSame(Point a) {
        if (x == a.x && y == a.y) {
            return true;
        } else {
            return false;
        }
    }

    //public boolean is(int a, int b) {
      //  if (x == a.x && y == a.y) {
      //      return true;
       // } else {
         //   return false;
       // }
        //     (y(x) = a * x + b);
        //  }
        //  }

//2. Задано уравнение функции y(x) = a * x + b;

//3. Добавьте метод в класс Point определяющий находится ли точка на этой фукнции.

        //public boolean is(int a, int b) {
        // return ....; // используя координаты точки и вычисления функции.
        //  }
//}

    }
//}