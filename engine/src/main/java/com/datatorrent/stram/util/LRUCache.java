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
package com.datatorrent.stram.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>LRUCache class.</p>
 *
 * @param <K> key
 * @param <V> value
 * @since 0.3.5
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V>
{
  private static final long serialVersionUID = 1L;
  private final int capacity; // Maximum number of items in the cache.

  public LRUCache(int capacity, boolean accessOrder)
  {
    super(capacity + 1, 1.0f, accessOrder); // Pass 'true' for accessOrder.
    this.capacity = capacity;
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry<K, V> entry)
  {
    return (size() > this.capacity);
  }

}
