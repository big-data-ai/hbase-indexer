/*
 * Copyright 2012 NGDATA nv
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
package com.ngdata.sep;

/**
 * Handles incoming Side-Effect Processor messages.
 */
public interface EventListener {

    /**
     * Process an event that has been delivered via the Side-Effect Processor (SEP).
     * <p>
     * If an exception is thrown while processing a message, the same message (along with any others that were batched
     * along with it) will be retried later by the SEP. For this reason, message handling should be idempotent.
     * 
     * @param event contains data involved in the HBase update
     */
    void processEvent(SepEvent event);
}
