/*
 * Copyright (c) 2020, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.regex.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

public class UTFBenchmark extends BenchmarkBase {

    @State(Scope.Benchmark)
    public static class BenchState {
        String str = "\udbb9\udda4\udbe5\udd10\ud8a3\ude44\ud9f0\udc20\udad5\udd5a\ud941\udcd6\udab9\udc0d\udbf6\udedb\ud8d0\udd2e\ud8c3\udcf8\u33b9\udb2e\udc19\uda71\udc01\uda21\udfd1\uda7e\uddce\udb4a\udf7f\uda3a\udd49" +
                        "\u7a08\udb53\udd41\udb5e\ude67\udb1e\udeed\udba5\udc69\udab4\udde5\udb73\udf02\ud824\udec3\ud930\udcd2\ud909\udf6d\ud89e\udf95\udaa2\udda3\ud853\udc44\udb3f\udf1f\udabb\udfe4\ud89f\ude28\udad8" +
                        "\udc19\udb68\ude18\ud958\udeac\uda13\udd03\ud967\udc55\ud854\ude36\ud814\udd49\udbdd\udcfb\ud971\udd14\udaa3\udfa5\udb85\udf78\ud800\udc85\ud8e5\udd23\ud97b\udd09\ud980\udd37\u2efb\ud8f9\udfab" +
                        "\ud96f\udc45\ud996\udcc9\uda8d\udf7c\ud8e2\udf08\udb5f\udde6\uda44\uded5\ud947\udf61\ud8cb\udeb9\udba7\udd30\ud976\udeae\ud98f\ude57\ud9bf\ude70\udba8\udec3\udad8\udcae\uda2a\ude1e\uda67\udc48" +
                        "\ud8a9\udfe8\udbfb\udcbb\udbd8\udfdd\ud8d3\udc16\ud91d\udc7e\udad5\udeeb\ud930\udd1f\ud8d0\uddd7\uda54\udd7b\ud96a\udc44\ud88a\ude6e\udb89\udd49\ud80e\ude21\ud9f1\udd9c\ud8fa\udd8a\ufc97\ud8ad" +
                        "\uddc0\ud829\ude9f\uda58\udd46\ud874\udc2c\ud811\udc21\udbae\udeef\udaaa\udd00\ud89e\udda9\ud879\ude96\udb4f\udf66\uda49\uddbb\uda0b\udff1\udb7b\udf9c\ud8d9\udd77\ud9d6\udedb\udb20\ude61\udb78" +
                        "\udf2a\ud853\udeb2\ud8b3\udc7c\ud825\udd1d\ud874\udd99\uda3f\ude66\udbdb\udd6f\udba4\udc86\ud98d\udf2f\ud9a0\udf60\uda6c\uded1\udb95\uddc7\udac2\ude49\udb6e\udfd2\uda81\udf4a\ud9ea\ude8f\ud990" +
                        "\ude25\udacd\udd4f\ud83d\udfdf\ud98b\uddd9\ud9f0\udc49\ucaf3\ud985\udc75\udbe1\udfe6\uda09\ude94\uda70\udfa0\ud987\udde3\udad9\udf4d\udaf0\udfdf\u5263\udaae\udfb2\uda7f\udd29\uda18\udd50\u7af4" +
                        "\uda64\udf74\udaf2\ude70\ud916\ude3b\ud8df\udc5c\ud84e\udfbe\udaec\udc63\udb42\udcb4\ud980\udfb1\ud849\udcc3\ud9d5\ude21\uda4c\udcb5\ud8e2\udcfd\udacc\udc8e\ud985\udd57\ud86c\udfe8\ud9d6\udc3d" +
                        "\udb95\udcdb\uda30\udc12\ud99e\udc13\ud93a\udc85\ud9d0\udc93\ud92c\uddb5\uda82\ude1e\udb90\udf41\udb27\udee3\ud8ef\udd06\uda89\udfc1\ud8d7\udd96\ud80c\uddf8\ua962\ud8fe\uddce\uda59\udde6\uda27" +
                        "\udf58\uda84\udd11\ud91a\udd18\udb09\udf72\udb59\udfe0\ud864\udeb4\ud925\udfff\uc61b\udb49\udd56\udbd9\udfdb\udb8a\ude99\udb4d\udc41\udab1\udfaa\udaa4\udeb3\ud829\udf7f\ud879\udccc\ud94a\udfce" +
                        "\ud8fd\udcdc\udb31\ud916\udf49\u062f\uda30\udd59\uda72\udc27\u5c2c\ud86e\udece\udb76\udfa1\uda13\udd75\u9f34\ud857\udd00\udbf5\uddd2\ud9d3\ude19\udac1\uddec\udb2c\udcbe\u6005\udbb0\udee5\uda5e" +
                        "\udc4d\uda69\udfaa\uda46\udebc\ud870\udd03\ud86a\udd81\ud99c\udf9f\ud977\ude78\uda47\udf2a\ud809\udec2\uda7a\udcf3\udbea\ude68\ud9c0\udf5c\ud9cc\ude61\ud8a2\ude4c\udaa3\udc3b\uda90\udf59\udb43" +
                        "\udce3\ud88e\udc1b\udbfc\udf17\udb08\udda4\uda1b\ude45\ud947\uddba\uda3f\udfa2\udbe4\udd2f\ud8c4\udd61\ud8c5\ude1e\udb20\udf3d\uc9a5\udbd4\udf69\ud918\ude39\uda60\udc50\udb25\ude54\ud942\udd8f" +
                        "\ud80a\udeef\uda87\uddc0\uda9a\uddb6\uda33\udec7\udbfa\udcb2\ud947\udf7d\udbf7\udf9a\ud98a\udfa4\uda5a\udebc\ud905\ude39\ud9fd\udff4\udb86\ude5f\ud9b5\udfe8\udae6\udc33\udb3d\udc3d\udba2\udcf7" +
                        "\udb28\udf2e\ud97d\udd31\udb18\udd88\u9b72\udb03\uddb9\ud93d\udf8c\ud8de\udd23\udaa4\udc41\ud9dc\udca7\ud9d9\udc65\uda68\udde6\ud952\udcc1\u285c\ud983\udcf6\uda9f\udc1b\udba5\udfde\uda66\udf83" +
                        "\udb18\udf03\ud920\ude0a\uda26\udcd2\uda9d\udfa3\ud928\ude6e\ud8f9\udf1f\ud81c\udc0b\ud9b7\udd59\udbf0\uddea\ud93f\udfba\udafe\udc2b\ud875\ude38\ud85f\udcc8\ud846\udf93\uda3f\udd29\uda03\ude3a" +
                        "\uda39\udfed\uda17\udcc8\ud871\udf95\udb9a\udee1\uda48\udfe5\uda6d\udd85\udbf6\uddf8\ud8ae\uddee\ud837\ude10\uda35\ude4f\ud978\ude59\udb14\uddbd\u72fa\uda9d\udeed\udb40\udddc\udac7\udd3b\ud868" +
                        "\udfc9\ud800\udff3\udbeb\udc86\u2d85\uf0cf\ud956\udeec\udaa0\udf1b\ud8e2\udf1f\udab2\udf3f\udb37\udf23\udbaa\udd28\udb68\udcce\ud93b\udffd\udaf4\udd0e\ud94e\udd1d\udbce\ude13\u5d8e\ud8dc\ude58" +
                        "\udbe6\udc92\ud92b\udf44\ud81d\udf2f\u208a\udba3\udeaa\udbde\udd48\udb41\udf01\ud90c\udc55\ud8c7\ude95\uda41\udeee\udb3c\udd61\uf37e\ud8d2\udc2f\ud953\uddeb\udae2\udf56\udb3c\udf66\udafc\udcc6" +
                        "\ud88c\udd6e\ud8a9\ude24\ud8c2\ude35\udbd5\uddf9\ud95e\udc62\udb20\uddfd\ud9a9\udca3\udaa3\udcbb\uda6b\udd3f\ud9fe\uddd7\ud8c5\ude63\udaeb\ude77\ud8f8\udd8d\uda96\ude59\ud822\udf2c\ud9dd\ude4e" +
                        "\udabb\udef7\ud9dd\uddef\uda6f\ude64\ud80c\udc7b\uda9c\udc08\ud8a9\udffd\udb90\udf6b\ud87f\uddd8\udb92\ude84\ud826\udd2f\udab2\udc82\ud963\udd7a\uda91\udd65\udb6d\udeef\udb17\ude57\uda63\ude76" +
                        "\ud9f1\udc71\udb9b\udff0\udb1b\ude2e\uda8e\udfc7\ud9d8\udf74\udb19\udfe7\uda6a\udcad\ud8e1\udc48\udbf2\udf20\udabd\udc5a\ud9b5\udf44\uda1c\udcdb\ud82e\udd7d\udb55\udc90\ud806\ude37\ud862\udeac" +
                        "\ud876\udc0e\ud8cd\udea8\udb2f\udd49\u2390\udaa6\udd82\ud94e\udfc6\ud89b\udd07\ud860\ude87\udbbe\udd13\ud893\udd68\uda4d\udeae\ud845\ude60\uda65\udd7f\ud82d\uddd7\uda57\udcba\udafc\udc7c\ud990" +
                        "\udda1\ud8c3\uddb8\udb2a\ude0c\udaba\uddaa\udbf1\udcac\udbcc\udcc2\ud9e3\uddb6\uf332\ud909\udc03\udb22\udf8a\ud93a\udd66\udacd\udded\ud8dc\udcb7\ud9cd\udc7a\udbc7\udc6e\ud970\udd91\udb6c\ude9d" +
                        "\ud9d8\udde0\uda5d\udd6c\ud96b\ude0b\ud84a\udf0b\udb3b\udf22\ud875\udc9b\udb6c\udd05\uda32\udd30\udb30\udf10\ue8b4\ud892\udd87\ud812\ude0d\ud842\udd52\ud8c4\udc82\udaf0\udfb9\udac7\ude14\ud914" +
                        "\udd00\udba2\udf01\uda5d\udec6\ud8b3\ude5b\ud9f0\ude50\uda90\udc32\udbef\udedd\uda8e\udf7d\udaef\udd6a\ud943\udc7e\udb55\udd51\uda2c\udc0d\ud9d5\udc58\ud8c6\udcc4\ud972\udce1\udb18\udcb8\ud9cc" +
                        "\ude19\uda9a\udd01\ud8be\udc11\ud8a4\udff6\udba8\udcd4\udbda\udf9b\udbe3\udfb7\ud9d2\udf6c\ud820\udd2a\udb7c\udf4a\uaf92\ud9ba\udce2\udb49\udca4\ud9e9\udda3\uda3d\udf13\uda7a\udcdc\uda47\udd4c" +
                        "\ud822\udc43\ud917\udc40\uda1b\udcd7\udacd\udc57\udbbd\ude94\ud813\udeae\uda7b\udf22\ud936\uddff\udaba\ude3f\ud8b2\udcac\udb46\ude56\ud8a0\udc6f\ud9c8\udc2e\uda84\udc7f\uda97\ude73\ud9dc\udfd8" +
                        "\uda11\udc3c\u0bc7\udb9f\udd98\ud938\udda1\ud8fb\udd7c\uda49\udf00\uda3a\ude5e\udaf8\udcbb\ud8b5\udd23\uda3c\udf24\ud91c\uddd2\ud9db\udd12\ud914\ude13\ud9ae\udf6e\ud912\udf0e\ud89a\udc1f\uc305" +
                        "\ud81d\udd3a\udb51\ude73\ud934\udc9a\udbcc\udd51\u8c08\ud85d\ude85\udb60\udf4d\uda85\ude5d\ud94a\udfa0\udad3\udc63\uda3d\udf04\udaf3\udda0\udbf2\ude4f\udb70\udde1\udae1\udda1\ud977\udd52\uda35" +
                        "\udd4f\uda72\udf44\ud9bd\udc4c\udbb7\udfb2\ud860\udd45\udaba\ude99\uda03\udcc7\uda9d\udef3\udab8\udce3\udb17\udeb2\ud88e\udddf\uda95\uddc4\udba0\udfae\udac1\udfbe\udb8e\udcfe\ud881\ude7b\ud97f" +
                        "\udeda\ud8ee\udf84\ud944\udede\ubadd\ud8b8\ude51\ud9d8\udf3c\udb2b\udd58\udb03\ude8c\ud9ae\udfd2\ud8f7\udd0a\ud8da\udc5a\u460d\udbfa\ude36\ud84e\udf18\uda15\udff7\ud94d\udc75\uda88\udece\uda26" +
                        "\ude4e\ud973\udd99\udae4\uddb0\ud86a\udee9\ud99a\udeb1\ud800\ude52\ud80a\udf6e\ud959\udf72\ud9e8\udf55\udab5\udc4f\udabe\udeab\ud801\udcb5\uda3f\udc00\uda2a\udd6d\ud931\udfd9\ud9a6\udc42\udbb9" +
                        "\ude5d\ua8e6\ud829\udfab\ud8cf\udeea\ud8a8\udcda\ud9a7\ude24\ud90e\ude80\ud956\udce6\udb97\udd1f\udb3d\udeb6\udbce\udc6b\udbc9\ude18\ud9c5\udc2a\udb9b\udd60\udb5c\udfdb\ud829\udc69\udb50\ude0b" +
                        "\uda45\udc4c\ud8c7\udcec\udb2c\ude51\ud998\udf39\udae4\udc5f\ud9ab\udf49\udb25\udf75\udaeb\udd90\uda9d\udfa7\ud825\udcbb\ud9cd\udd6a\ud887\udee8\ud9f9\udcf0\ud849\ude53\uda10\ude97\ud9a6\udf53" +
                        "\ud95c\ude76\udb15\ude30\ud984\udd39\ud81d\udcf2\ud97b\uddb4\udaba\udfee\ud9e1\udc81\uda95\udf74\udb4d\ude5b\udbb7\uddab\uda7d\uddd8\ud98c\udd2d\ud876\ude5e\udafb\udfb7\uec42\ud854\udfcf\ud948" +
                        "\udd2a\ud919\udcd7\ud9a9\udfe0\udaa9\udec7\u57f3\uda8a\udd36\ud9e8\udf8f\udb19\udd36\udb54\udd2a\ud860\udde9\uda93\udeaf\udbe0\udd8a\ud88a\udd0b\udb3a\udf1d\udad8\udcfe\ud99a\udcb9\udb20\udd52" +
                        "\udb1b\udee0\ud8d2\udea2\udadf\udf1a\udb61\ude0d\udbd7\ude88\uda98\ude45\ud9d4\udce0\ud84b\udd8d\ud8fe\udcc4\udaa4\udf5a\udb04\udc33\ud951\udd76\udb09\ude3d\udadb\ude7f\ud966\udeec\ud93f\udef6" +
                        "\udac5\udee8\u9dfb\ud838\udded\udb73\udc12\ud84a\uddeb\ud978\udc66\udbcb\udc1b\ud820\udc1c\udbca\ude29\ud8f2\udf68\udbd3\udefa\udbf1\udd41\udae2\udd6c\ud86e\udc99\ud9e5\udee3\uda86\udd3e\udbf9" +
                        "\udc2e\ud897\ude88\ud86e\udce4\ud8e8\udf33\ud92e\udc04\ud9ed\udfd8\udb32\udc34\udb55\udc90\ud875\udea8\uda3e\ude84\ud8f2\udd51\udbf9\udf2c\udb2f\udfa1\ud8a0\udd42\u1cb8\ud81a\ude74\ud86a\ude91" +
                        "\udaea\udd05\ud866\udf41\ud84c\uddc0\uda6b\udc1b\uda31\udc9d\uda77\ude14\ud8c5\uddc1\udaff\udf6e\udb5a\udc7a\ud833\udc4b\udb46\udf17\udb87\ude73\ud95c\udc8e\ud88a\udc26\ud8eb\udfff\ud93c\ude8f" +
                        "\udb50\ude50\ud91d\udde5\uda74\udf2a\ud9c2\udc15\ud8bb\udcdc\ud80d\ude46\ud965\udda8\udb93\ude4b\ud9fa\udd37\ud9c3\ude9b\udb22\ude03\u8e17\uda57\udcb1\ud986\udc87\ud834\ude69\uda58\udd47\udaf7" +
                        "\udf63\ud8cc\udf55\udb28\udc01\udac5\udc7a\udb3a\udcd8\ud8f4\udcf4\udb85\udd5e\udb9f\uddad\ud909\udcc8\ud956\udc93\udb27\ude11\ud81c\udd66\ud884\ude00\udab6\udcd5\ud97b\udd58\uda88\udc77\uda9b" +
                        "\udd5d\ud918\udfb1\udafd\uddf5\ud952\udc6f\ud9c2\udef6\udbc3\uddea\udb53\udd1a\udb70\udca3\udb37\udf5a\ud88b\udc25\udbe2\ude80\ud963\uddd4\ud886\udeee\udac1\udfac\ud855\udf97\ud911\ude7d\u5979" +
                        "\udab9\udcbe\ud83f\udfd8\ud8cc\uddbc\ud881\udfbb\ud9b5\udc90\ud8dd\udc36\ud8ca\udeda\ud810\udd37\udb9b\udce5\ud8f4\udfb3\ud9fc\udf79\udba2\udc12\udb47\udf45\uda2a\udf0e\u3e59\ud9f6\udd14\u89dd" +
                        "\uda8f\udd99\ud997\udcc6\ud9af\uddcb\ud8ee\udff2\udb92\udd29\udac6\udca2\uda47\udece\ud902\udc03\udbf5\udf28\udb39\udd0b\udaae\udc1f\udb67\udd7b\uda33\udcc4\udb8b\udfa8\ud90c\uddaa\ud9f1\udc10" +
                        "\ud8c3\udc4a\uda0f\udc95\udb3f\uddea\udacc\udebb\u198d\udbe5\udee8\ud8d0\udcab\ud8a7\udc54\udad4\udf80\ud9ef\udfe0\ud807\udfea\uda4a\udfc9\uf4e4\udb19\udeaa\uda00\udcd8\udbd2\uddfa\udbcb\ude1a" +
                        "\ud884\udecf\ud8d4\udefd\udbe9\udf35\uda32\ude1a\udaf2\udf3d\udbea\udf7a\udb88\ude49\ud87c\udc7c\udbf8\udfef\udbc4\ude67\ud831\udf49\ud96d\udeb4\uda6f\udc3c\ud961\udc5b\ud9af\udfdf\ud854\ude5b" +
                        "\udbf5\udfba\ud8b2\ude09\ud9ab\udf4a\ud9b7\udea8\ud916\udfcc\udbba\udc07\ud9e4\udff5\udaf1\udefd\uda66\udfcf\ud962\udcaa\ud9fa\udcb5\ud982\udc9e\ud83f\udddd\udab8\ude0e\udad7\udf9f\ud8a7\udd7c" +
                        "\ud9c8\ude3c\ud9ee\ude32\ud8cc\udc84\udba0\ude30\udab5\udf67\ud8d2\udf40\udae5\udd0b\udbfa\udd03\ud841\udcb6\ud9ba\udde9\ud86b\udc69\udb53\udc29\ud855\uddac\u6fef\ud968\udcbf\ud8cc\udd0f\uda43" +
                        "\udfdd\udbe3\udcbc\ud9e2\udc0f\udb23\udeca\ud947\udd7a\ud9cf\ude30\ud886\udedc\udbba\uddae\ud83d\ude7b\udaf4\udf78\uda7e\ude5e\udb55\ude00\udbec\ude67\ud9bf\udc19\ud878\udc5f\ud86c\udfc3\ud84b" +
                        "\udcc3\ud9e1\udd0d\ud8ec\udeb5\udae5\uddae\ud9f1\ude15\udb61\ude04\uda05\udc5c\ud8d9\udd3f\ud9ba\udf93\udb78\udccb\udb6b\ude2f\udbdd\udde9\ud98b\udf6d\ud885\udcca\uda82\udd43\ud969\udad6\udfb4" +
                        "\ud9a2\udca7\ud81d\udce1\udb39\udf37\ud862\udde5\ud9a3\udc09\udac4\ude1d\udaa2\udd17\udb7a\udd16\ud8dc\udf77\uda6f\udf17\udbdf\udece\udadf\udcbc\uda14\udc5e\ud9ce\udfce\udb7a\udef2\ube17\ud8f9" +
                        "\udf31\ud860\ude9c\ud826\udedb\udaaa\ude3b\udbe9\uddab\udafb\ude52\udaa6\udfb6\ud899\udebb\ud85e\udf30\u67f0\udb33\udeb8\uda91\udef3\ud825\udd51\ud81d\ude01\ud813\ude6e\udb26\udff2\ud888\ude6f" +
                        "\uda69\udf91\udaa5\udf33\ud916\udd02\udb97\udc76\udbdd\udccc\ud921\udcbc\udb4d\uded6\uda0f\uddcb\udb93\udf35\ud855\udecd\udbe7\udf50\uda98\ude41\ud88e\udf7f\udb03\udf0e\ud912\udfec\udb6d\ude44" +
                        "\udb7b\udf0c\ud926\uddf8\udbc8\udccc\udbed\ude18\udb82\udeff\uda15\udcea\ud85b\ude60\uda07\udf3c\uda2b\udf00\ud9a8\udf58\uda18\udfb1\udac5\udde8\ud8cf\udd8c\ud999\udd22\udb46\udf4b\uda78\udcb6" +
                        "\ud932\udff5\udb50\udc03\ud8d3\udcc5\uda1f\udc5d\udb55\udffd\ud9f3\ude20\udb13\udcee\ud85a\udd97\udb1f\udd0b\ud8b8\udfc0\ua696\udb0d\udf25\ud940\udf08\udb0f\ude1b\udb8d\uddf6\ud81a\udde9\ud9d0" +
                        "\udcd9\uda43\udd4b\u50bd\ud8a1\udd30\ud8bb\udc79\udbba\udf5f\ud909\udcb8\ud845\udd12\ud864\udeb1\ud97c\ude8f\uda85\udf1c\udaef\udcf2\udba4\udc77\uc489\udb63\ude73\ud9db\udc21\ud901\udfe1\ud99d" +
                        "\udcea\ud98c\udd21\ud8be\ude9f\uda3a\udec4\ud85a\udcc8\ud890\ude92\udaa4\udc01\ud8f5\udcee\ud897\udd6c\ud9da\udd03\ud995\ude6e\udb43\udffb\ud9ba\udc1d\udbf1\udde9\udb06\udfc3\ud92e\uded8\ud9f8" +
                        "\udd17\ud9fa\udf01\udb28\uded7\uaed2\udad2\udf9b\udaf5\uddf5\ud921\uded8\udb57\udc5a\udadb\udd20\ubca8\uda2c\uded4\ud9de\udd57\ue5a7\udbc5\udc1f\ud923\udf54\uda3e\udf28\udaae\udf2c\udbf7\udc0b" +
                        "\ud80a\udc23\udadd\ude35\u6a38\udbf6\udcf7\ud96b\udc2c\ud867\udd30\ud9cb\udd93\udb01\udf0a\udb72\udd81\ud98e\uddee\udb33\udf17\ud90b\udf7a\udaa1\udf78\ud866\udddc\ud89c\udfa1\uda0a\ude8e\ud9d8" +
                        "\udcf0\ud942\udc1f\udabd\udc20\udb3e\udc4d\ud820\udcb1\u8f4c\udadd\uddcf\ud91e\uddc8\ud808\uddf1\udb77\udcc1\udb84\udf7f\ud88d\udd01\udacd\udef3\udaef\udf9e\ud9e2\ude0d\ud88b\udd77\ud825\udfca" +
                        "\uda97\udd63\ud97e\uddf4\udade\udf4f\udbc6\udf3c\ud8f5\ude28\ud87b\udffb\ud87a\udf20\udb86\udfc2\ud8ac\ude73\udb41\udf0f\u905b\ud982\udeab\ud905\udcb9\ud965\udd2b\udb75\udc56\ud8f4\udf5f\uda12" +
                        "\udc74\ud87d\udd73\udaca\udff3\ud9bc\udcc1\ud83a\udcdd\uda08\udd61\udb4f\uddf1\u36ae\ud89e\udd47\uda5a\udf16\ud8f8\udfcf\uda9c\udda3\ud97a\udd18\uda52\uded2\ud883\udf58\uda07\ude7b\udac7\udd64" +
                        "\udbd4\udd7f\udb8f\uded0\udae7\udc55\udb4e\ude27\ud85c\ude68\udaf2\uddb9\uda16\ude94\udb41\udd1f\uda3d\ude07\uda7c\udc42\ud969\udd00\ud8d7\udc44\u87fb\ud94d\udf4d\udbf4\udc09\ud816\udde5\ud97c" +
                        "\ude18\udb4e\udf1c\uda69\udf2c\u6061\uda4d\ude99\uda70\ude97\udb87\udf6f\ud9b9\udf7e\uda76\udf70\udbdf\udd3c\ud91c\udc06\udb21\udd69\udbd6\udcbe\ud91d\udda3\uda34\udf18\ud993\udd4a\udb6f\udc5f" +
                        "\ud978\udead\ud814\udc9b\uda8f\udd83\ud8ed\udc9c\ud968\udd49\udb85\udd5b\ud885\udf86\udb15\udc04\udb10\udce2\udabe\udc1a\uda66\udf50\udbc0\udc54\uda0b\udc68\ud93b\uded2\ud9b0\udc86\udb87\ude93" +
                        "\ud9c6\uddfa\udb95\ude16\uda89\udf2a\udb0b\ude3b\ud822\udf2d\uda83\udc96\udaa6\uddfa\uda09\udd91\udaf1\udffc\udbe1\udcc1\ud807\udc65\udac0\udd16\u5e4c\udb43\ude85\udb67\ude2b\udaa6\udc16\udb34" +
                        "\udc1a\udbae\udf32\u0e90\ud93a\udc5d\ud86e\ude43\udb17\udd7c\uda4a\udd3c\ud98a\udf09\udb57\uddef\udb91\udf9f\udb3d\udeb2\ud9c9\udc7b\ud905\ude9b\ud9a2\udd9d\uda26\ude6b\uda50\udd67\udbf9\udec2" +
                        "\udbe4\udda3\udbaa\udc8f\udb0c\udf0b\uda39\udd28\ud8cc\udc8a\udaf7\udd4f\ud837\udc7d\udb7d\udcc3\uda89\udc79\ud9eb\udfe1\udb20\udf1c\ud974\udd46\uda1a\udfa7\udbf6\udf19\ud855\udc28\ud906\ude4b" +
                        "\uda70\udd3e\udbe5\udda1\udb5c\udd6e\ud869\udf1c\ud9f1\ude5b\ud9b4\udfd5\udbb5\udf1c\ud843\udd1d\ud99e\udd32\udbe3\udd3d\uda63\udcb3\uda78\udeda\udaef\udc4f\udbe7\udfa8\uda6c\udf1a\udbfa\udda9" +
                        "\udab3\udff7\ud9a2\udde1\ud9c8\uddce\ud879\udffc\ud82f\udfad\uda36\udc11\udbd9\udd37\ud9e7\ude45\udb39\uddd0\ubbb1\ud884\udc16\ud938\udc86\ud931\udf61\ud8fa\udd29\udbdc\ude1b\ud8df\ude74\udaaa" +
                        "\udde3\udb1d\udd0a\uda39\udd93\ud951\udc47\uda59\udd5b\ud942\udee5\uda01\ude3f\ud8bf\ude21\udb85\udc77\udadd\udfc6\ud8d0\udf40\ud942\udc18\ud919\udccb\udb08\ude50\udad7\ude2e\udb25\udce2\ud89a" +
                        "\udd36\uda6a\ude76\udba2\udd47\ud9dd\udd1c\uf063\uda62\uded3\ud9bd\udec4\ud932\udd37\ud960\udd6c\ud9cd\udda7\udb72\udf47\udb29\udfff\u4098\ud931\udf6f\udb21\udd71\udad8\udfc9\uda47\ude45\ud902" +
                        "\udd20\udbc3\udc91\udaae\udc39\uda34\udde1\udbc6\udfff\ud92e\udc77\ucaad\uda90\udf12\udbf2\udd20\udab1\udc66\ud861\udf4a\ud8c8\udef6\udb43\ude79\ud82f\udf27\udae1\udca1\udbe5\udf84\uda48\udfa2" +
                        "\ud9aa\ude3a\udb0d\udffd\ud93e\udf11\ud934\udc2b\udaa6\ude28\ud8f9\udc4b\udb34\uddef\udbe3\udd99\ud8f2\uddf4\ud8d3\udda7\udb4e\udc30\u8eff\ud98c\udfb0\udb76\udf7f\udaca\udd88\udb5a\udc36\udbb8" +
                        "\udc2b\ud91c\udf66\uda89\udd50\uda2b\udeb9\udb0f\udfc8\udb7d\ude77\udb34\udca7\udba3\ude1f\udbff\ude6a\udb3a\udf64\udad6\udcb3\ud9ba\ude35\ud9f9\udc8b\ud8df\udf1a\ud91d\udf05\ud8d2\udcb7\ud85d" +
                        "\udf6c\udae9\ude12\ud986\ude1b\ud857\udcab\uda4a\ude67\uda32\udc37\ud934\udfff\ud8eb\udd5b\ud804\udf60\ud800\udd6f\ud814\udd0c\udbdc\udeed\ud9cd\udc5a\ud928\udcc9\uda0e\udcd0\ud858\udea0\ud9e3" +
                        "\udc25\ud98c\udc41\udbfe\udf0d\udab1\udca5\ud9d0\udc35\ud87b\udf32\ud84a\udeda\ucd98\ud8d4\udd8f\udbd2\udd59\ud94a\udde7\udb35\udd99\uda9b\udedc\ud9dd\udc81\ud881\udddd\udba9\udf0c\udb65\udda0" +
                        "\ud8ff\uded1\udaa2\udde4\uda6f\udee9\ud9d5\udc84\uda6d\udfae\uda69\ude3e\ud87e\udcc0\ud928\udccf\udabf\udd4e\udb1c\udc10\ud8b0\udc4d\u50f3\uda46\udcdb\udac6\udf41\ud9e0\udeb3\uda5b\ude44\udabc" +
                        "\udf3f\udb9c\udc7b\ud8ae\udd59\ud86b\udfc3\ud803\udc92\udb18\udd4f\udba2\udc5e\ud824\udc19\u401e\ud85f\udc75\ud962\udeba\uda24\udc9f\udb9f\udf0b\udb49\udc31\ud8c1\uddf2\ud9d6\udf9a\udb52\udfac" +
                        "\ud9e2\udcd0\ud957\udf77\ud965\udf84\ud817\udf64\ud862\udd52\udb93\udd9c\uda57\udd85\ud9e1\udd36\ud82f\udc22\uda77\ude33\ud899\udd01\ud914\udee9\ud980\ude00\ud843\udcc3\ud905\ude4b\ud9c2\uded4" +
                        "\ud809\udcff\ud950\ude67\ud9b5\ude77\udb64\udc4b\uda49\uddaa\ud9ee\udd46\ud83f\ude4c\uf8a6\ud83e\udc42\udb17\uddaa\u0e58\uda78\udeea\ud8e5\udc23\ud819\udebf\uda34\ude1e\ud998\udc17\ud895\udf45" +
                        "\udbe0\udcea\udb51\udc6b\udab5\ude0e\ud877\udfdd\udbc0\udfc4\ud9c9\udec7\ud979\udf1c\uda27\ude23\ud853\uddb2\udb17\ude06\ud842\udc27\udb20\udc2f\ud9ff\udf22\udb91\uddfe\u0f73\udb8e\uddfd\ud81b" +
                        "\udf64\ud853\ude52\udb29\ude12\ud972\udf8f\udad5\udd22\u526d\udac9\udde6\uda81\udf31\udb8f\udc7e\udb4f\ude8b\udb03\ude54\ud9be\uddd8\udb41\udcc7\ud92c\udff1\ud8f6\udd87\ud98d\udfa4\uda8f\udfd7" +
                        "\udadf\ude3d\udba7\udc5e\udb4b\ude85\udbfb\udd0b\udaf2\udfd8\udbde\udef3\udbf0\udcf9\ud8aa\udde0\ud9ce\udf87\ud8e6\udfc9\udbe2\udef3\ud804\ude27\udb3c\udd21\ud8b8\udf91\ud9d4\uded8\ua9e4\uda00" +
                        "\udf5b\udbd8\udf99\udb12\udca2\ud992\udec9\ud9ed\udcbf\ud9c1\udcd2\ud527\ud9ab\udf4a\ud9c2\uddbb\ud8a6\udd7c\ud836\udf74\udb95\udd5d\uda9b\uddd6\ud947\udf70\udadb\ude53\ud824\uded0\udb8e\uddfd" +
                        "\ud9e7\udd0a\uda86\udfed\udb55\udd46\udb83\uddfc\ua2b1\u1188\ud829\udfcf\uda43\udf08\ud9c6\udf04\uda5e\udd70\ud9ee\udc23\udb0f\udd79\uda2c\udfa2\ud8a5\udcf4\uda2d\udd7b\uda4c\udf94\udaf2\udc96" +
                        "\u3488\ud8e0\udf0d\udb6f\udf86\ud857\udc5d\udb14\udc08\ud836\udc22\uda3a\ude6e\ud991\ude96\udb68\udd1c\uda41\udfd5\uda87\ude91\ud918\udf46\ud890\uddb6\u4a6a\udacf\udeb1\ud98b\udcc4\udb1c\udcb8" +
                        "\udac0\ude48\udbe8\udc77\udaf2\ude47\ubeb3\udb05\ude94\ud83f\udc0d\ud90f\udd0a\ud981\udccb\ud987\udd6c\ud960\udec8\udafd\ude19\ud9e9\udfb6\udb2b\udfbd\uda5b\udf03\ud9af\udebc\uc8e3\udbf8\udcc2" +
                        "\u7f07\uda1f\udd7d\udb49\udfb7\ud81c\udf19\udbfb\udd26\ud900\uddd6\ud865\udcf2\udb01\udd83\ud9a5\udee7\ud8e8\udc7c\udb7e\ude30\udac4\udd38\u255b\ud802\ude42\udbc5\udf8c\udb0c\udfe5\udb4a\udc8e" +
                        "\ud9d9\udfac\udb8e\udd5f\udb77\udf44\uda4e\udc19\ud858\udf11\ud892\udc26\udb4a\udc55\ud992\uded5\udb5a\udf6b\ub482\ud844\udc3e\ud925\udfaa\ud906\uddbf\ud978\udd58\ud9d0\udcbc\uda5c\udd85\u4323" +
                        "\udaf3\ude18\ud875\ude45\uda2c\udc68\udbb8\udd71\ud938\udf1b\udb5c\uddbc\ud856\udd9b\udae7\udc87\ud838\ude26\udb5a\udfd0\ud8d6\udd00\ud8d7\ude37\ud847\udd0c\ud9a8\udff2\ud94f\udd84\udb3e\uded2" +
                        "\ud98d\udc6f\u04f1\u0ab1\ud9a6\udc4c\ud9b0\udca6\ud8de\udd33\uda14\udd61\uda47\ude0c\uda19\udebb\ud96a\udc92\udab8\udd8d\ud865\udf53\ud8be\udf8b\udb9e\uddd0\ud961\udf44\uda44\ude46\u7710\udabc" +
                        "\uddb9\udb19\udcb7\udbc9\udd99\udb66\uddbc\udaea\uddd4\uda66\udf71\udab9\udeda\ud8d1\uddfb\ud82e\udcc5\uda05\udea3\ud9ae\udf57\ud8eb\udfdb\ud9a1\ude42\u689d\udb83\uddae\ud8a9\udcc8\ud8e9\udcb0" +
                        "\udab3\udd59\udbe4\uddef\uda93\udd70\ud99a\ude59\ud921\udc32\ud818\ude6f\udb3a\udfc5\ud9a9\udc4c\uda74\udeb2\udb37\udf2c\ud80d\udf21\udbd7\udcd2\ud848\ude88\ud9b6\uddd8\ud9c6\udc83\uda53\udf88" +
                        "\ud8f3\udc98\udace\udc84\ud86a\udcf7\ud891\udd1e\ud8d0\udf2d\udb76\udcea\u7414\uda0c\udcab\ud85b\udd4a\ud947\ude57\udac8\udc9f\uda22\udcaa\ud889\udd1e\udacd\udc33\udb70\udd4e\udafd\udd95\ud83a" +
                        "\udf95\ud82b\udf2e\udacb\udfa6\ud884\udc1c\ud800\udf0b\ud8b5\udf09\udabc\udf05\u8902\ud950\udf1b\udaa0\udefe\udb15\uddbc\udaed\udc95\ud985\udf96\ud804\udece\udb5a\ude54\udb84\udfc8\udb4f\udc90" +
                        "\ud96b\ude65\ud878\udef2\uda85\udcee\udaba\udd94\ud8a5\ude2b\udb2f\udcd5\udab9\ude15\ud98f\uddf7\ud83b\udde9\udbf8\uddfb\ud8b4\udefd\ue04a\ud983\udc56\udb40\udee3\udb12\udcb4\ud978\udee9\ud9fe" +
                        "\udd3e\udb42\ude6e\ud9ce\udccf\uda07\udfb0\udbd9\udc4e\uaddf\ud88d\ude46\ud8d7\udccd\uda7f\ude7e\udb2e\udf01\ud911\udded\udbab\udcb1\uda70\udc1b\ud8f9\ude68\udbff\udc8b\ud966\udf21\ud991\udd70" +
                        "\ud9fe\udfcf\uda49\udc99\ud969\udbc3\udc10\ud81c\udea1\udb31\udd98\udb4e\udfaf\ud93e\udec3\u8893\udb81\udf0f\udb7e\udd65\uda0f\ude0b\ud909\udc6e\uda42\udd20\ud8d0\uded8\ud908\udf51\uda38\udeea" +
                        "\ud8db\udcc6\ud917\udde6\ud94f\udcb1\ud833\udfb6\udb39\uddae\ud8a6\udfcc\uda2d\udf5f\ud9db\udc95\udb73\udfae\ud9e6\ude1d\ud91b\udeb4\ud872\udca2\ud918\udde6\ud998\udccf\ud839\uddd9\udb22\uddb4" +
                        "\ud9ee\udd72\ud943\udf70\uf20f\udb3a\udddc\ud9e5\uddc9\udbba\udf76\uda9f\udf98\ud9b2\udf0b\udb90\udcb5\ud9b0\uddb3\uda9e\udf45\uda88\uded1\ud96e\udfef\ud96b\udce7\uda62\ude9d\udb48\udc40\ud93b" +
                        "\ude56\udb1c\udf70\ud9f7\udca7\ud863\uddef\ud8ca\udecc\ud833\ude1c\ud8bf\udd55\ud904\ude1a\u0aad\udb82\ude1f\ud80d\udd8d\u0ee7\udbcd\udded\ud826\udc20\udb28\uddd4\ud841\udcc3\u52cd\ud98e\ude6d" +
                        "\ud9f2\udd99\ud99e\udceb\uda7d\udf3a\ud8e9\udc4f\uda48\udd1c\ud8e0\ude07\uda45\uddc2\udb1f\udc79\udbdf\udff9\udbcf\udcf0\uda40\udc33\ud49a\ud8cd\ude55\ud962\udf92\ud86e\uddd2\ud812\udc12\uda42" +
                        "\udea4\udaa7\udfed\udafc\udf35\udb84\udfc1\udb02\ude14\uda3d\udd36\ud86a\uddbe\ud826\udcfa\udaad\udd99\ud85e\udd1a\ud901\udcb4\udbf7\udd96\ud8ad\udd96\ud8f1\udf22\ud92a\uddff\ubb25\ud877\ude25" +
                        "\ud95e\udc31\ud899\udc80\udba3\udf40\ud9fb\ude03\uda2a\udc2b\udaa5\ude0b\ud917\udefa\udb84\ude1b\udbfc\udfb0\uda23\udf02\uda5f\udf75\ud835\udfad\ud914\udc06\ud9e1\udd8f\ud8bd\udd90\ud9b5\udf1b" +
                        "\uda8f\udf15\udb21\ude7d\ud9b7\udebe\uda40\udd50\ud8c0\udd8b\ud856\uddb4\u54f2\udbc6\uddcd\ud9a2\udd20\uda3d\udc4f\uda17\udfb6\ud8e1\udf51\ud983\udcf4\ub25c\udb29\udc5b\ud9d1\udd25\uda90\ude14" +
                        "\udb8c\ude2f\ud9e9\udf4b\udb57\udf01\u5a1b\ud852\udf63\ud8e4\udc7a\uda40\udd9e\uda02\uddf5\uda8e\udf6e\ud9a1\udcfb\ud932\uddd9\ud97e\udebf\ud8b0\udde0\ud971\udfaf\ud927\udc81\ud8c9\udeca\udbe1" +
                        "\ude38\udb7c\udf18\uda7c\udcbd\udb71\udcbf\ud8f0\udd63\udaaf\ude4b\ud985\udf1d\ud9a0\udedc\ud9b1\udcd2\ud877\udf04\udbe9\udf3b\ud83d\udc5c\udae6\udd36\udaae\uded4\ude0d\udacc\udef5\ud9a3\udedb" +
                        "\ud8ae\udd75\udb95\udecb\udb35\ude7b\udb0e\udd9e\ud88a\ude3e\ud90a\udc77\udb61\udca2\ud8bc\ude8d\udab3\udeb1\uda44\ude0e\ud95e\udee0\ud926\udd19\ud98f\udc32\ud97f\udf49\ud8e5\udc71\udbbb\uddfa" +
                        "\udbd9\uded3\udb74\udc10\udb5b\ude74\ud960\udda0\ud8f1\udf4a\ud83b\udc7c\udb9b\udc33\uda74\udc51\udb2b\ude04\udbf3\udf87\ud99f\udd80\ud9f1\udde3\uda9d\udd52\udb14\ude53\udbaa\udd3a\u8318\uda59" +
                        "\udcc2\ud888\ude13\ud85f\uddef\udab7\ude91\udb0d\udf89\u6a9a\udaaa\ude9b\uda6e\udf71\udad6\udc1b\ud817\udf7e\udb88\udd8f\ud9fb\udf8f\ud940\udedd\ud8fb\udde9\udb91\udf6d\ud9c4\udf57\ud968\uddf2" +
                        "\uda60\udcfc\ud9f4\udc50\ud9cd\udd3e\ud432\udb58\udedf\udbc3\udd08\udac2\udedf\ud82c\udd39\ud8f9\udc69\ud862\ude83\uda76\uddb7\ud9bf\udc9b\ud945\udd69\udbc1\udd47\udb3c\udd7a\ud986\ude35\udadd" +
                        "\udf8f\uda74\udf1b\udacc\ude0f\udbad\udd9f\ud86d\uddfa\udb01\udcc6\ub72f\udb0b\udebd\ud942\udf5f\udba8\uddef\ud8d8\udf95\ud8ff\udd75\ud9e8\udcd2\udae0\udd23\ud929\udde3\u5e7b\udab3\udf35\uda97" +
                        "\uddf5\uda1c\udd11\ud96e\udf47\ud8f3\udd3a\ud8bb\udf40\ud940\ude92\udbd7\udf28\ud8bd\udc16\ud8b7\udf88\uda2c\udc05\ud94a\udf72\ud899\udcc4\uda6a\udd7f\ud925\ude94\ud8c7\udcd3\ud95d\udff2\uda9e" +
                        "\udea3\udba9\udded\ud964\udfc4\ud8c0\ude8c\ud9d7\ude04\ud908\udcdb\uda1c\ude1b\udb06\udce4\udb04\udd24\uda53\udd80\udacf\udfbd\udaa6\ude7b\uda41\udcf7\uaf31\uda6a\udc70\u706f\ud80b\udd09\ud870" +
                        "\udfee\ud8b1\udcce\udb82\udc80\u5ebf\udf7c\ud8b0\udc55\ud9cd\udec0\ud908\udeb5\ud9d7\ude21\ud923\ude9c\udad1\udfd7\ufa47\udac2\udcfc\ud8a0\udda0\ud96b\uddf0\udace\udf2b\uda09\uddfe\ud8ec\udf3d" +
                        "\u5244\ud870\udf3b\ud893\udd89\ud854\udfb8\u3541\udbf9\ude51\ud8af\udfa3\udb43\udf79\ud8a9\udf56\ud886\udc4c\ud8a4\uded7\ud877\uddd6\ud841\udc5e\udbbd\udd2f\udb2d\udea8\ud9aa\udf0a\udade\udfa6" +
                        "\ud99a\udd68\ud918\udfb3\uda1b\udf44\udac3\ude9d\ud9f7\udc2d\udbcc\udf60\udb59\udcdc\udae4\udc17\uda57\ude02\ud9ae\udd44\uda0b\udfa0\u0e3d\udb7f\udd58\uda86\udc17\ud8f9\udf4d\udb2c\udd15\ud820" +
                        "\udf4f\uda6b\udc4d\udac5\udf19\uda6d\udfaa\udbbe\ude9c";
    }

    @Benchmark
    public void javaDecode(BenchState state, Blackhole blackhole) {
        String str = state.str;
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            int cp = c;
            i++;
            if (Character.isHighSurrogate(c) && i < str.length()) {
                char c2 = str.charAt(i);
                if (Character.isLowSurrogate(c2)) {
                    cp = Character.toCodePoint(c, c2);
                    i++;
                }
            }
            blackhole.consume(cp);
        }
    }

    @Benchmark
    public void shiftDecode(BenchState state, Blackhole blackhole) {
        String str = state.str;
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            int cp = c;
            i++;
            if (((c >> 10) == 0x36) && i < str.length()) {
                char c2 = str.charAt(i);
                if ((c2 >> 10) == 0x37) {
                    cp = Character.toCodePoint(c, c2);
                    i++;
                }
            }
            blackhole.consume(cp);
        }
    }

}