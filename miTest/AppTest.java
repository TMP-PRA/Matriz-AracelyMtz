package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
static Matriz m;
//String valor;
@BeforeAll public static void setup(){
    m = new Matriz();
}
int[][] a = { {1,3}, {-1,0} };
int[][] b = { {4,5 }, {-1,0}}; 

@Test public void testSuma(){     
    int[][] rsum = { {5,8 }, {-2,0}};
    assertTrue(m.suma(a,b)== rsum);
}
@Test public void testMultiplica(){
    int[][] rmult = { {1,5}, {-4,-5} };
    assertTrue(m.multiplica(a,b)==rmult);
}    
}