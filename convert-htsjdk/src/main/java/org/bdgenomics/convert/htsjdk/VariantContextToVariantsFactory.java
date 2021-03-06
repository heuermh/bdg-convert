/**
 * Licensed to Big Data Genomics (BDG) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The BDG licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bdgenomics.convert.htsjdk;

import java.util.List;

import htsjdk.variant.variantcontext.VariantContext;

import htsjdk.variant.vcf.VCFHeader;

import org.bdgenomics.convert.Converter;

import org.bdgenomics.formats.avro.Variant;

/**
 * Factory for creating VariantContext to list of Variants converters, which
 * require late binding for a VCFHeader.
 */
public interface VariantContextToVariantsFactory {

    /**
     * Create a new VariantContext to list of Variants converter with the specified header.
     *
     * @param header header, must not be null
     * @return a new VariantContext to list of Variants converter with the specified header
     */
    Converter<VariantContext, List<Variant>> create(VCFHeader header);
}
