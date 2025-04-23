package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStack {

        @Test
        public void testStackpush() {
                Stack stack = new Stack(5);
                stack.push(1);
                stack.push(2);
                stack.push(3);



        }
        @Test
        public void testPop() {
                Stack stack = new Stack(5);
                Stack.pop();


        }

        }

