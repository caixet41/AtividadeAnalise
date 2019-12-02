# AtividadeAnalise
atividade analise com 3 patterns

Foi desenvolvido uma aplicação que  gerencia as menagens enviadas a um suposto cliente.
enviando, processando, salvando as mensagens, assim como escolher o modo em que as mesmas serão enviadas.

Para enviar a mensagem foi escolhido o strategy pois ele seleciona como ela sera enviada, sms ou whatsapp.

Para Verificar se a mensagem pode ser enviada via whatsapp foi criado um state, pois se a versao do android for desatualizada , a mensagem só sera enviada via sms.

Para processar essa conversa foi aplicado o template, podendo salva-la num arquivo txt local, ou subir para a nuvem.



