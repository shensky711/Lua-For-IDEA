/*
 * Copyright 2011 Jon S Akhtar (Sylvanaar)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.sylvanaar.idea.Lua.editor.highlighter;

import com.intellij.codeInsight.highlighting.ReadWriteAccessDetector;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.util.PsiTreeUtil;
import com.sylvanaar.idea.Lua.lang.psi.LuaPsiElement;
import com.sylvanaar.idea.Lua.lang.psi.expressions.LuaDeclarationExpression;
import com.sylvanaar.idea.Lua.lang.psi.expressions.LuaExpression;
import com.sylvanaar.idea.Lua.lang.psi.expressions.LuaExpressionList;
import com.sylvanaar.idea.Lua.lang.psi.statements.LuaAssignmentStatement;
import com.sylvanaar.idea.Lua.lang.psi.statements.LuaGenericForStatement;
import com.sylvanaar.idea.Lua.lang.psi.statements.LuaNumericForStatement;
import com.sylvanaar.idea.Lua.lang.psi.statements.LuaStatementElement;
import com.sylvanaar.idea.Lua.lang.psi.symbols.LuaCompoundIdentifier;
import com.sylvanaar.idea.Lua.lang.psi.symbols.LuaSymbol;
import com.sylvanaar.idea.Lua.lang.psi.util.LuaPsiUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Jon S Akhtar
 * Date: 4/17/11
 * Time: 1:37 AM
 */
public class LuaReadWriteAccessDetector extends ReadWriteAccessDetector {
    @Override
    public boolean isReadWriteAccessible(PsiElement element) {
        return element instanceof LuaSymbol;
    }

    @Override
    public boolean isDeclarationWriteAccess(PsiElement element) {
        if (! (element instanceof LuaSymbol))
            return false;

        LuaStatementElement stmt = PsiTreeUtil.getParentOfType(element, LuaGenericForStatement.class);
        if (stmt != null && PsiTreeUtil.getParentOfType(element, LuaExpressionList.class, true, LuaGenericForStatement.class) == null )
            return true;

        stmt = PsiTreeUtil.getParentOfType(element, LuaNumericForStatement.class);
        if (stmt != null)
            return true;

        LuaAssignmentStatement assign = PsiTreeUtil.getParentOfType(element, LuaAssignmentStatement.class);
        if (assign == null)
            return false;

        LuaExpression value = assign.getAssignedValue((LuaSymbol) element);

        return value != null;
    }

  public Access getReferenceAccess(final PsiElement referencedElement, final PsiReference reference) {
      if (reference.getElement() instanceof LuaCompoundIdentifier) {
          if (((LuaCompoundIdentifier) reference.getElement()).isCompoundDeclaration()) return Access.Write;
      } else {
          if (reference.getElement() instanceof LuaDeclarationExpression) return Access.Write;
      }
      
      return LuaPsiUtils.isLValue((LuaPsiElement) reference) ? Access.Write : Access.Read;
  }

  public Access getExpressionAccess(final PsiElement expression) {
    return LuaPsiUtils.isLValue((LuaPsiElement) expression) ? Access.Write : Access.Read;
  }
}
