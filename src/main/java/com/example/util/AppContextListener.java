package com.example.util;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Inicialización si quieres
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Nada crítico aquí, solo asegurarse de cerrar recursos de la app
        // MySQL limpiará hilos automáticamente al detener Tomcat
    }
}
