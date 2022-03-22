/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2022 DBeaver Corp and others
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

package org.jkiss.dbeaver.ui.editors.sql.indent;

public interface SQLIndentSymbols
{
    int TokenEOF   = -1;
    int TokenOTHER = 0;

    int Tokenbegin = 1000;
    int TokenBEGIN = 1001;
    int Tokenend = 1002;
    int TokenEND = 1003;

    int TokenCASE = 1004;
    int Tokencase = 1005;

    int TokenLOOP = 1006;
    int Tokenloop = 1007;
    int TokenENDLOOP = 1008;
    int Tokenendloop = 1009;

    int TokenIF = 1010;
    int Tokenif = 1011;
    int TokenTHEN = 1012;
    int Tokenthen = 1013;
    int TokenENDIF = 1014;
    int Tokenendif = 1015;

    int TokenIDENT = 2000;
    int TokenKeyword = 3000;
    int TokenKeywordStart = 3001;

    String BEGIN = "BEGIN";
    String begin = "begin";
    String end = "end";
    String END = "END";
//    String end2 = "end ";
//    String END2 = "END ";

    String tCASE = "CASE";
    String tcase = "case";

    String LOOP = "LOOP";
    String loop = "loop";
    String ENDLOOP = "END LOOP";
    String endloop = "end loop";

    String tIF = "IF";
    String tif = "if";
    String tTHEN = "THEN";
    String tthen = "then";
    String tENDIF = "END IF";
    String tendif = "end if";
}

