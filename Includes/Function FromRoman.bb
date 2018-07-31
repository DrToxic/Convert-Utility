	Local tempvar1
	Local Workvar1
	If Len(in$)=0 Then Return "Not a Number"
	While Len(in$)>0
		If Left(in$,2)="CM"     Then workvar1=workvar1+900	: in$=Mid(in$,3)
		ElseIf Left(in$,1)="M"  Then workvar1=workvar1+1000	: in$=Mid(in$,2)
		ElseIf Left(in$,2)="CD" Then workvar1=workvar1+400	: in$=Mid(in$,3)
		ElseIf Left(in$,1)="D"  Then workvar1=workvar1+500	: in$=Mid(in$,2)
		ElseIf Left(in$,1)="D"  Then workvar1=workvar1+500	: in$=Mid(in$,2)
		ElseIf Left(in$,1)="C"  Then workvar1=workvar1+100	: in$=Mid(in$,2)
		ElseIf Left(in$,2)="XC" Then workvar1=workvar1+90	: in$=Mid(in$,3)
		ElseIf Left(in$,2)="XL" Then workvar1=workvar1+40	: in$=Mid(in$,3)
		ElseIf Left(in$,1)="L"  Then workvar1=workvar1+50	: in$=Mid(in$,2)
		ElseIf Left(in$,2)="IX" Then workvar1=workvar1+9	: in$=Mid(in$,3)
		ElseIf Left(in$,1)="X"  Then workvar1=workvar1+10	: in$=Mid(in$,2)
		ElseIf Left(in$,2)="IV" Then workvar1=workvar1+4	: in$=Mid(in$,3)
		ElseIf Left(in$,1)="V"  Then workvar1=workvar1+5	: in$=Mid(in$,2)
		ElseIf Left(in$,1)="I"  Then workvar1=workvar1+1	: in$=Mid(in$,2)
		End If	
	Wend
	
	Return workvar1	