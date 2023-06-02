package CSE1204;

import CSE1204.Outer.Inner;

class Outer{

    private int x; 
    public void show()
    {   
            System.out.println("This is void show.");
    }

    
    class Inner {
            public int y;
            Inner(){}
            public void setY(int y) {
                this.y = y;
            }
            public int getY() {
                return y;
            }
    }
    
}

public class innerclass {

        public static void main(String[] args) {
            Outer obj_out = new Outer();
            obj_out.show();

            Outer.Inner obj_in = obj_out.new Inner();
            obj_in.setY(5);
            System.out.println(obj_in.getY());

        }
    
}
