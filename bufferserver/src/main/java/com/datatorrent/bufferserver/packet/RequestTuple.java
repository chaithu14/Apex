/**
 * Copyright (C) 2015 DataTorrent, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.bufferserver.packet;

import com.datatorrent.netlet.util.Slice;

/**
 * <p>Abstract RequestTuple class.</p>
 *
 * @since 0.3.2
 */
public abstract class RequestTuple extends Tuple
{
  protected boolean valid;
  protected boolean parsed;

  public RequestTuple(byte[] buffer, int offset, int length)
  {
    super(buffer, offset, length);
  }

  public boolean isValid()
  {
    return valid;
  }

  @Override
  public int getPartition()
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Slice getData()
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int getWindowWidth()
  {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public abstract void parse();

  public abstract String getVersion();

  public abstract String getIdentifier();

}
