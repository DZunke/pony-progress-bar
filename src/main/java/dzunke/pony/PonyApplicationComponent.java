package dzunke.pony;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PonyApplicationComponent implements LafManagerListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", PonyProgressBarUi.class.getName());
        UIManager.getDefaults().put(PonyProgressBarUi.class.getName(), PonyProgressBarUi.class);
    }
}
