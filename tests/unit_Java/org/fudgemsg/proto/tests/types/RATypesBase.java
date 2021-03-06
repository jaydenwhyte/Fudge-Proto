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

package org.fudgemsg.proto.tests.types;

import java.util.List;

import javax.time.calendar.LocalDate;
import javax.time.calendar.LocalDateTime;
import javax.time.calendar.LocalTime;

import org.fudgemsg.FudgeMsg;

public interface RATypesBase {

  public List<boolean[]> get_Boolean();

  public List<byte[]> get_Byte();

  public List<double[]> get_Double();

  public List<float[]> get_Float();

  public List<boolean[]> get_Indicator();

  public List<int[]> get_Int();

  public List<long[]> get_Long();

  public List<short[]> get_Short();

  public List<String[]> get_String();

  public List<SubMessage[]> get_SubMessage();

  public List<CustomEnum[]> get_CustomEnum();

  public List<FudgeMsg[]> get_Message();

  public List<LocalDate[]> get_Date();

  public List<LocalDateTime[]> get_DateTime();

  public List<LocalTime[]> get_Time();

}
