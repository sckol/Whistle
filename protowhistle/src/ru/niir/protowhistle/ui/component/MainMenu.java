package ru.niir.protowhistle.ui.component;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

import ru.niir.protowhistle.ui.UIController;

public class MainMenu extends List implements Component {
	public MainMenu() {
		super("������� ������������", List.IMPLICIT, new String[] {
				"����������� ����������", "�������������� ������",
				"���� ����������", "���� ����������", "�������", "���� �����", "����������", "���� �������" },
				null);
	}

	public void show(final Display display, final UIController controller) {
		setCommandListener(new CommandListener() {
			public void commandAction(Command c, Displayable d) {
				switch (getSelectedIndex()) {
				case 0:
					controller.showDeviceSelector();
					break;
				case 1:
					controller.showCategorySelector();
					break;
				case 2:
					controller.showTerminal();
					break;
				case 3:
					controller.showAlarm();
					break;
				case 4:
					controller.showConsole();
					break;
				case 5:
					controller.showVideo();
					break;
				case 6:
					controller.showCalibrator();
					break;
				case 7:
					controller.fakeFall();
					break;
				}
			}
		});
		display.setCurrent(this);
	}
}
