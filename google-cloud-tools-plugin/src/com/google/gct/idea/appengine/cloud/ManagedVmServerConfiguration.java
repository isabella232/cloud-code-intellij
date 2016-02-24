/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gct.idea.appengine.cloud;

import com.intellij.remoteServer.configuration.ServerConfigurationBase;
import com.intellij.util.xmlb.annotations.Attribute;

/**
 * Model for the IntelliJ application scoped 'Cloud' configurations.  This is a base configuration
 * used by Managed VM deployment runtime configurations. It's primarily the bits that can be
 * re-used across deployments, such as auth and project.
 */
public class ManagedVmServerConfiguration extends
    ServerConfigurationBase<ManagedVmServerConfiguration> {

  private String cloudSdkPath;
  private String cloudProjectName;

  @Attribute("cloudSdkPath")
  public String getCloudSdkPath() {
    return cloudSdkPath;
  }

  @Attribute("cloudProjectName")
  public String getCloudProjectName() {
    return cloudProjectName;
  }

  public void setCloudSdkPath(String cloudSdkPath) {
    this.cloudSdkPath = cloudSdkPath;
  }

  public void setCloudProjectName(String cloudProjectName) {
    this.cloudProjectName = cloudProjectName;
  }
}