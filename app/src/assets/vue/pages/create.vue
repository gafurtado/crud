<template>
  <f7-page>
    <f7-navbar title="Sobre" back-link="Back" sliding></f7-navbar>
     <form class="list form-store-data" id="demo-form">
        <li class="item-content item-input">
          <div class="item-inner">
            <div class="item-title item-label">Nome</div>
            <div class="item-input-wrap">
              <input name="nome" type="text" placeholder="Seu nome" v-model="form.nome">
              <span class="input-clear-button"></span>
            </div>
          </div>
        </li>
        <li class="item-content item-input">
          <div class="item-inner">
            <div class="item-title item-label">E-mail</div>
            <div class="item-input-wrap">
              <input name="email" type="email" placeholder="Seu email" v-model="form.email">
              <span class="input-clear-button"></span>
            </div>
          </div>
        </li>
        <f7-col tag="span">
          <f7-button type="submit" @click.prevent="submit" raised outline round>Enviar</f7-button>
        </f7-col>  
        </form>
  </f7-page>
</template>
<script>
  export default {
    data(){
      return{
          form: {
              nome: '',
              email: '',
          }
      }
    },
    methods: {
      submit(){
        this.$store.dispatch('savePessoa', this.form);
      }
    }
  };
</script>
