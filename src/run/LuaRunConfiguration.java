/*
 * Copyright 2010 Jon S Akhtar (Sylvanaar)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.sylvanaar.idea.Lua.run;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.process.CapturingProcessHandler;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.JDOMExternalizable;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class LuaRunConfiguration extends RunConfigurationBase  {
  private Module myModule;
  private String myModuleName;

  public String VM_PARAMETERS;
  public String PROGRAM_PARAMETERS;
  @NonNls private static final String NAME = "name";
  @NonNls private static final String MODULE = "module";

  public LuaRunConfiguration(final Project project, final ConfigurationFactory factory, final String name) {
    super(project, factory, name);
  }

  public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new LuaRunConfigurationEditor(this);
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider provider) {
    return null;
  }

  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner runner) {
    return null;
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment env) throws ExecutionException {
//    if (getModule() == null){
//      throw new ExecutionException(DevKitBundle.message("run.configuration.no.module.specified"));
//    }
//    final ModuleRootManager rootManager = ModuleRootManager.getInstance(getModule());
//    final Sdk jdk = rootManager.getSdk();
//    if (jdk == null) {
//      throw CantRunException.noJdkForModule(getModule());
//    }
//
//    final Sdk ideaJdk = IdeaJdk.findIdeaJdk(jdk);
//    if (ideaJdk == null) {
//      throw new ExecutionException(DevKitBundle.message("jdk.type.incorrect.common"));
//    }
//    String sandboxHome = ((Sandbox)ideaJdk.getSdkAdditionalData()).getSandboxHome();
//
//    if (sandboxHome == null){
//      throw new ExecutionException(DevKitBundle.message("sandbox.no.configured"));
//    }
//
//    try {
//      sandboxHome = new File(sandboxHome).getCanonicalPath();
//    }
//    catch (IOException e) {
//      throw new ExecutionException(DevKitBundle.message("sandbox.no.configured"));
//    }
//    final String canonicalSandbox = sandboxHome;
//
//    //copy license from running instance of idea
//    IdeaLicenseHelper.copyIDEALicencse(sandboxHome, ideaJdk);

    final CommandLineState state = new CommandLineState(env) {

        @Override
        protected OSProcessHandler startProcess() throws ExecutionException {
            ProcessBuilder pb = new ProcessBuilder("luac");
            CapturingProcessHandler processHandler = null;
            try {
                processHandler = new CapturingProcessHandler(pb.start());
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            ProcessTerminatedListener.attach(processHandler);
            return processHandler;

        }
    };

    state.setConsoleBuilder(TextConsoleBuilderFactory.getInstance().createBuilder(getProject()));
    return state;
  }

    @Override
    public void checkConfiguration() throws RuntimeConfigurationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}