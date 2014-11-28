package com.softwaremill.stash.donelug;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

import javax.swing.*;
import java.util.Collection;

/**
 * Provider for main list tool window.
 */
public class DoneLugToolWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {


        toolWindow.getComponent().add(new JLabel("test"));
    }


    private Collection<String> generateItems(String stashUrl, String repoName, String projectName, String pullRequestId) {
        //TODO
        return null;
    }




}
