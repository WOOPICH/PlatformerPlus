package woopich;

import org.lwjgl.opengl.GL;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.glfw.GLFW.*;

public class GameWindow {

    public GameWindow() {

        if (!glfwInit()) {
            System.err.println("GLFW Failed to initialize!");
        }

        long window = glfwCreateWindow(640, 480, "Game", 0, 0);

        glfwShowWindow(window);

        glfwMakeContextCurrent(window);

        GL.createCapabilities();

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);

            glBegin(GL_QUADS);
                glColor4f(1,0,0,0);
                glVertex2f(-0.5f, 0.5f);

                glColor4f(0,1,0,0);
                glVertex2f(0.5f, 0.5f);

                glColor4f(0,0,1,0);
                glVertex2f(0.5f, -0.5f);

                glColor4f(1,1,1,0);
                glVertex2f(-0.5f, -0.5f);
            glEnd();

            glfwSwapBuffers(window);
        }

        glfwTerminate();
    }
}
