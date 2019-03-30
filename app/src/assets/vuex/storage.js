import Vue from 'vue'
import Vuex from 'vuex'

import axios from 'axios'

Vue.use(Vuex);
// getters
// actions
// mutations
export default new Vuex.Store({
  state: {
    user: {},
    pessoas: [],
  },

  getters: {
    pessoas: state => state.pessoas
  },

  actions: {
    loadPessoas ({ commit }) {
      axios
        .get("http://localhost:8090/api/v1/pessoas")
        .then(r => r.data)
        .then(pessoas => {
          commit('LOAD_PESSOAS', pessoas)
        })
    },
    savePessoa({commit}, data){
      axios
        .post("http://localhost:8090/api/v1/pessoas", data)
        .then(result => {
          console.log(result);
      })
    },
    userLogged ({commit}, user) {
      commit('USER_LOGGED', user)
    }
  },

  mutations: {
    USER_LOGGED (state, user) {
      state.user = user
    },
    LOAD_PESSOAS (state, pessoas){
      state.pessoas = pessoas
    }
  },
});