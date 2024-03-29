/*
 * Copyright 2015 Yunus Emre Şeker. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.y3seker.egeyemekhanemobil.models;

/**
 * Created by Yunus Emre Şeker on 24.10.2015.
 */
public class CancelItem {
    public String text, name;
    public boolean isChecked;

    public CancelItem(String text, String name) {
        this.text = text;
        this.name = name;
        this.isChecked = false;
    }
}
