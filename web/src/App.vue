<template>
  <div>
    <div>昵称：{{ botName }}</div>
    <div>战力：{{ botRating }}</div>
  </div>

  <router-view/>
</template>

<script>
import $ from 'jquery';
import { ref } from 'vue';

export default {
  name: "App",
  setup: () => {
    const botName = ref("");
    const botRating = ref("");

    $.ajax({
      url: 'http://127.0.0.1:3000/bot/info/',
      type: 'get',
      success: resp => {
        botName.value = resp.botName;
        botRating.value = resp.botRating;
      }
    });

    return {
      botName,
      botRating,
    }
  }
}
</script>

<style>

</style>
