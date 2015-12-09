grammar Plantuml;

file: statements+ | comments* | otherLine* ;

statements : startUmlStatement |
             startBoxStatement |
             participantStatement |
             beginGroupStatement |
             endStatement |
             messageStatement |
             startSingleLineNoteStatement |
             startMultiLineNoteStatement |
             endNoteStatement |
             endUmlStatement ;

NEWLINE : '\r'?'\n';

startUmlStatement : '@startuml' ;


ALPHA_NUM : [a-zA-Z1-9._] | '-' ;
participantId : '"'? ALPHA_NUM+ '"'?;
COLOR_SPEC : '#' ALPHA_NUM+  ;
QUOTED_STRING : '"' .*? '"' ;

startBoxStatement : 'box' QUOTED_STRING COLOR_SPEC?;

PARTICIPANT : 'particpant' |
              'actor' |
              'entity' |
              'boundary' |
              'database' ;

simpleParticipantStatement : PARTICIPANT participantId;
particpantAsStatement : PARTICIPANT QUOTED_STRING 'as' participantId ;
participantStatement : simpleParticipantStatement | particpantAsStatement ;

GROUP : 'alt'      |
        'else'     |
        'opt'      |
        'loop'     |
        'par'      |
        'break'    |
        'critical' |
        'group' ;

LABEL : QUOTED_STRING | TILL_NEWLINE ;
beginGroupStatement : GROUP LABEL;

endStatement : NEWLINE 'end' NEWLINE ;
               

TILL_NEWLINE : .*? NEWLINE ;
messageString : QUOTED_STRING | TILL_NEWLINE;             
messageStatement : participantId '-' '['? COLOR_SPEC? ']'? '>' participantId ':' messageString ;

endUmlStatement : '@enduml' ;

NOTE_POSITION : 'right' | 'left' | 'over';
startSingleLineNoteStatement : 'note' NOTE_POSITION 'of'? PARTICIPANT? ','? PARTICIPANT? ':' LABEL;
startMultiLineNoteStatement : 'note' NOTE_POSITION 'of'? PARTICIPANT? ','? PARTICIPANT?;
endNoteStatement : 'end' 'note';

SINGLE_LINE_COMMENT : '\'' TILL_NEWLINE;
singleLineComment : SINGLE_LINE_COMMENT ;

START_MULITLINE_COMMENT : '/\'' TILL_NEWLINE ;
startMultilineComment : START_MULITLINE_COMMENT ;

END_MULTILINE_COMMENT : .*? '\'/';
endMultiLineComment : END_MULTILINE_COMMENT ;

comments : singleLineComment | startMultilineComment | endMultiLineComment ;

otherLine : TILL_NEWLINE ;

WS : [ \t\r\n] -> skip ;
