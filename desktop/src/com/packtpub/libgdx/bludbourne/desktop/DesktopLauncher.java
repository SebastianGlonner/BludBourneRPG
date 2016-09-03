package com.packtpub.libgdx.bludbourne.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.packtpub.libgdx.bludbourne.BludBourne;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.height = 600;
		config.width = 800;
		config.title = "BludBourne";
		config.useGL30 = false;

		Application app = new LwjglApplication(new BludBourne(), config);
		app.setLogLevel(Application.LOG_DEBUG);
		app.setLogLevel(Application.LOG_INFO);
	}
}
