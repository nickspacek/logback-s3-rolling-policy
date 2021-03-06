/*
 * Copyright 2016 linkID Inc.
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

package ch.qos.logback.core.rolling.shutdown;

/**
 * User: gvhoecke <gianni.vanhoecke@lin-k.net>
 * Date: 13/07/15
 * Time: 16:20
 */
public class RollingPolicyJVMListener implements Runnable {

    private final RollingPolicyShutdownListener listener;

    /**
     * Registers a new shutdown hook.
     *
     * @param listener The shutdown hook to register.
     */
    public RollingPolicyJVMListener(final RollingPolicyShutdownListener listener) {

        this.listener = listener;
    }

    @Override
    public void run() {

        listener.doShutdown();
    }
}
