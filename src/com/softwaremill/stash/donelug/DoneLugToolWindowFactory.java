package com.softwaremill.stash.donelug;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBList;

import java.util.Arrays;
import java.util.Collection;

/**
 * Provider for main list tool window.
 */
public class DoneLugToolWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        JBList list = new JBList(generateItems("","","",""));
        toolWindow.getComponent().add(list);
    }


    private Collection<String> generateItems(String stashUrl, String repoName, String projectName, String pullRequestId) {
        return Arrays.asList("a","b","c","d");
    }




}
