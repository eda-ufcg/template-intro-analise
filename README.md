# template-intro-analise

Executando seu programa passando o conteúdo de um arquivo pela entrada padrão:
    
    java MeuPrograma < arquivo.txt

Redirecionando a saída de um programa java para um arquivo:
    
    java MeuPrograma > saida.txt

Executando o script de plot (a saída vai ser gerada no mesmo diretório). Depois do arquivo .R,
você deve passar a flag --vanilla e o caminho para a saída do seu programa deve ser o ultimo argumento, como no exemplo:
    

    R < caminho/p/plot.R --vanilla caminho/p/sort.data
