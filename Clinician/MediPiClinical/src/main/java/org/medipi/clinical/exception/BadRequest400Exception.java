/*
 Copyright 2016  Richard Robinson @ NHS Digital <rrobinson@nhs.net>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.medipi.clinical.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for throwing BadRequest
 * @author rick@robinsonhq.com
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequest400Exception extends RuntimeException {

    private static final long serialVersionUID = 7192423691154487404L;

    /**
     * Method to call Exception for throwing BadRequest

     * @param message
     */
    public BadRequest400Exception(String message) {
		super(message);
	}
	
}
