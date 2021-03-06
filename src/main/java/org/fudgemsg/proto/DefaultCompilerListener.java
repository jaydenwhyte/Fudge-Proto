/* Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.fudgemsg.proto;

/**
 * Default listener implementation that ignores any warnings and throws an exception when an error is detected.
 * This is not intended for production use, but as a crude default.
 * 
 * @author Andrew
 */
/* package */ class DefaultCompilerListener implements Compiler.WarningListener, Compiler.ErrorListener, Compiler.VerboseListener {
  
  /* package */ static final DefaultCompilerListener INSTANCE = new DefaultCompilerListener ();
  
  private DefaultCompilerListener () {
  }
  
  /**
   * Default error behaviour is to throw an exception. This should abort the compilation process.
   */
  @Override
  public void compilerError (final CodePosition position, final String message) {
    final StringBuilder sb = new StringBuilder ();
    sb.append ("compiler error '").append (message).append ('.');
    if (position != null) sb.append (" at ").append (position.toString ());
    throw new CompilationException (sb.toString ());
  }
  
  /**
   * Default warning behaviour is to ignore the problem.
   */
  @Override
  public void compilerWarning (final CodePosition position, final String message) {
    // deliberate no-op
  }
  
  /**
   * Default verbosity level is off.
   */
  @Override
  public int getVerbosity () {
    return 0;
  }
  
  /**
   * It's an illegal operation to write at verbosity 0.
   */
  @Override
  public void verboseMessage (final String text) {
    throw new IllegalStateException ("verboseMessage called on at level 0");
  }
  
}